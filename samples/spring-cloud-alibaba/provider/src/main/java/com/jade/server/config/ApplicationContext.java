package com.jade.server.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Date 2019-08-11 11:20
 * @Author jade
 **/
@Component
public class ApplicationContext implements ApplicationContextAware {
    private static org.springframework.context.ApplicationContext applicationContext;
    private static Map<String, String> propertiesMap;

    @Override
    public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) throws BeansException {
        ApplicationContext.applicationContext = applicationContext;
    }

    public static org.springframework.context.ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static <T> T getBean(Class<T> requiredType) throws BeansException {
        return (T) applicationContext.getBean(requiredType);
    }

    @SuppressWarnings("unchecked")
    public static <T> T getBean(String name) {
        return (T) getApplicationContext().getBean(name);
    }

}
