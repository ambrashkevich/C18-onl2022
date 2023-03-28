package by.tms.filter;

import static java.util.Objects.nonNull;

import by.tms.dao.UserDAO;
import by.tms.model.User;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(final ServletRequest request,
                         final ServletResponse response,
                         final FilterChain filterChain)

            throws IOException, ServletException {

        final HttpServletRequest req = (HttpServletRequest) request;
        final HttpServletResponse res = (HttpServletResponse) response;

        final String login = req.getParameter("login");
        final String password = req.getParameter("password");

        @SuppressWarnings("unchecked") final AtomicReference<UserDAO> dao = (AtomicReference<UserDAO>) req.getServletContext().getAttribute("dao");

        final HttpSession session = req.getSession();

        //Logged user.
        if (nonNull(session) &&
                nonNull(session.getAttribute("login")) &&
                nonNull(session.getAttribute("password"))) {

            final User.ROLE role = (User.ROLE) session.getAttribute("role");

            moveToMenu(req, res, role);


        } else if (dao.get().userIsExist(login, password)) {

            final User.ROLE role = dao.get().getRoleByLoginPassword(login, password);

            req.getSession().setAttribute("password", password);
            req.getSession().setAttribute("login", login);
            req.getSession().setAttribute("role", role);

            moveToMenu(req, res, role);

        } else {

            moveToMenu(req, res, User.ROLE.UNKNOWN);
        }
    }

    private void moveToMenu(final HttpServletRequest req,
                            final HttpServletResponse res,
                            final User.ROLE role)
            throws ServletException, IOException {

        if (role.equals(User.ROLE.ADMIN)) {

            req.getRequestDispatcher("/src/main/webapp/adminMenu.jsp").forward(req, res);

        } else if (role.equals(User.ROLE.USER)) {

            req.getRequestDispatcher("/src/main/webapp/userMenu.jsp").forward(req, res);

        } else {
            req.getRequestDispatcher("/src/main/webapp/saveRequest.jsp").forward(req, res);
        }
    }

    @Override
    public void destroy() {
    }

}
