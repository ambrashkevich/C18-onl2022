package loginForm.filter;

import loginForm.util.ValidationUtil;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.time.LocalDate;

@WebFilter("/sign-up")
public class ValidationFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        if (request.getMethod().equalsIgnoreCase("POST")) {
            String name = request.getParameter("newUsrName");
            String surname = request.getParameter("newUsrSurname");
            String email = request.getParameter("newUsrEmail");
            Integer year = Integer.valueOf(request.getParameter("brthYear"));
            Integer dayOfMonth = Integer.valueOf(request.getParameter("brthDay"));
            Integer month = Integer.valueOf(request.getParameter("brthMonth"));
            LocalDate brthDate = LocalDate.of(year, month, dayOfMonth);
            String password = request.getParameter("newUsrPass");
            System.out.println(name);
            if (ValidationUtil.isValidName(name, surname) && ValidationUtil.isValidPassword(password) && ValidationUtil.isValidAge(brthDate) && ValidationUtil.isValidEmail(email)) {
                System.out.println("fsafasfsa");
                request.setAttribute("isValid", true);
                filterChain.doFilter(servletRequest, servletResponse);


            } else {
                System.out.println("123456");
                request.setAttribute("isValid", false);
            }
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }
}
