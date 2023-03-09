package by.tms.Filter;

import by.tms.model.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/successful")
public class HomeFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String email = (String) request.getSession().getAttribute("email");
        String password = (String) request.getSession().getAttribute("pass");
        User user = new User();
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        if (email == null && password == null) {
            response.sendRedirect("/save-request");
        } else if (!email.equals(user.getUsername()) && !password.equals(user.getPassword())) {
            response.sendRedirect("/save-request");
        }
        filterChain.doFilter(request, response);
    }
}
