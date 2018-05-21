package bitcamp.java106.pms.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bitcamp.java106.pms.AppConfig;
import bitcamp.java106.pms.support.WebApplicationContextUtils;

@WebListener
public class ContextLoaderListener implements ServletContextListener {

    static ApplicationContext container;

    public static ApplicationContext getApplicationContext() {
        return container;
    }

    @Override
    public void contextInitialized(ServletContextEvent sre) {
        ApplicationContext iocContainer = 
                new AnnotationConfigApplicationContext(AppConfig.class);
        container = iocContainer;

        WebApplicationContextUtils.containers.put(
                sre.getServletContext(), iocContainer);
    }

}
