package by.tms.servlet;

import static by.tms.model.User.ROLE.ADMIN;
import static by.tms.model.User.ROLE.USER;

import by.tms.dao.UserDAO;
import by.tms.model.User;
import java.util.concurrent.atomic.AtomicReference;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {

    private AtomicReference<UserDAO> dao;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        dao = new AtomicReference<>(new UserDAO());
        dao.get().add(new User(1, "Admin", "admin", ADMIN));
        dao.get().add(new User(2, "Vadim", "vadim", USER));

        final ServletContext servletContext =
                servletContextEvent.getServletContext();

        servletContext.setAttribute("dao", dao);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        dao = null;
    }
}
