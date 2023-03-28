package by.tms.filter;

import by.tms.model.User;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/home")
public class HomeFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String email = (String) request.getSession().getAttribute("email");
        String password = (String) request.getSession().getAttribute("pass");
        User user = new User();
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        if (email == null && password == null) {
            response.sendRedirect("/login");
        } else if (!email.equals(user.getEmail()) && !password.equals(user.getPassword())) {
            response.sendRedirect("/login");
        }
    }
}
