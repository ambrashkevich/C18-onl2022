package com.tms.listener;

import com.tms.model.Command;
import com.tms.repository.util.ConnectionPool;
import com.tms.util.CommandControllerFactory;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import lombok.extern.slf4j.Slf4j;

@WebListener
@Slf4j
public class InitializationContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(final ServletContextEvent sce) {
        log.info("InitializationContextListener start");
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        sce.getServletContext().setAttribute("connectionPool", connectionPool);
        for (Command command : Command.values()) {
            try {
                CommandControllerFactory.defineCommand(command);
            } catch (Exception e) {
                log.error("Can not put values in commands map", e);
            }
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("InitializationContextListener stop");
        ConnectionPool connectionPool = (ConnectionPool) sce.getServletContext().getAttribute("connectionPool");
        connectionPool.closeAllConnection();
    }
}
