package loginform.filter;

import java.io.IOException;
import java.time.LocalDate;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import loginform.util.ValidationUtil;

@WebFilter("/sign-up")
public class ValidationFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        if (request.getMethod().equalsIgnoreCase("POST")) {
            String name = request.getParameter("newUsrName");
            String surname = request.getParameter("newUsrSurname");
            String email = request.getParameter("newUsrEmail");
            int year = Integer.parseInt(request.getParameter("brthYear"));
            int dayOfMonth = Integer.parseInt(request.getParameter("brthDay"));
            int month = Integer.parseInt(request.getParameter("brthMonth"));
            LocalDate brthDate = LocalDate.of(year, month, dayOfMonth);
            String password = request.getParameter("newUsrPass");
            if (ValidationUtil.isValidName(name, surname) && ValidationUtil.isValidPassword(password) && ValidationUtil.isValidAge(brthDate) && ValidationUtil.isValidEmail(email)) {
                request.setAttribute("isValid", true);
                filterChain.doFilter(servletRequest, servletResponse);
            } else {
                request.setAttribute("isValid", false);
            }
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }
}
