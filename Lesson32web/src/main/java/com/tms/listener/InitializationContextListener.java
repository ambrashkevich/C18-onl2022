package com.tms.listener;

import com.tms.config.BeanConfig;
import com.tms.repository.util.ConnectionPool;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@WebListener
@Slf4j
public class InitializationContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(final ServletContextEvent sce) {
        log.info("InitializationContextListener start");
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        sce.getServletContext().setAttribute("connectionPool", connectionPool);

        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        sce.getServletContext().setAttribute("appContext", ctx);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("InitializationContextListener stop");
        ConnectionPool connectionPool = (ConnectionPool) sce.getServletContext().getAttribute("connectionPool");
        connectionPool.closeAllConnection();
    }
}