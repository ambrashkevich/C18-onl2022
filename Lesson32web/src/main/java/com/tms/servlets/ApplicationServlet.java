package com.tms.servlets;


import static com.tms.model.PagesPath.SIGN_IN_PAGE;
import static com.tms.model.RequestParams.COMMAND;

import com.tms.controller.BaseCommandController;
import com.tms.exception.CommandException;
import com.tms.model.PagesPath;
import com.tms.util.Constants;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
@WebServlet("/eshop")
public class ApplicationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String commandKey = request.getParameter(COMMAND.getValue());
        if (commandKey == null || commandKey.isEmpty()) {
            commandKey = Constants.HOME_COMMAND;
        }
        try {
            AnnotationConfigApplicationContext appContext = (AnnotationConfigApplicationContext) request.getServletContext().getAttribute("appContext");
            BaseCommandController baseController = (BaseCommandController) appContext.getBean(commandKey);
            //сделать проверку или null или исключение
            PagesPath path = baseController.execute(request);
            RequestDispatcher dispatcher = request.getRequestDispatcher(path.getPath());
            dispatcher.forward(request, response);
        } catch (CommandException e) {
            log.error("non-validation error ", e);
            System.out.println(e.getMessage());
        } catch (Exception e) {
            log.error("Exception ", e);
//            логируем сообщение а потом должны перенаправить на страницу с ошибкой("Извините что-то поломалось!!!"),
            //           https://blog.hubspot.com/marketing/http-500-internal-server-error
//            также можно конверсейшен в URL запроса поместить
            request.getRequestDispatcher(SIGN_IN_PAGE.getPath()).forward(request, response);
        }
    }
}