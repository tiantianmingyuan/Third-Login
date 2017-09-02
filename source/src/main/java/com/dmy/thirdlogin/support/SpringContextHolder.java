package com.dmy.thirdlogin.support;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class SpringContextHolder implements ApplicationContextAware, EnvironmentAware {

    private static ApplicationContext applicationContext;

    private static Environment environment;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextHolder.applicationContext = applicationContext;
    }

    public void setEnvironment(Environment environment) {
        SpringContextHolder.environment = environment;
    }

    public static <T> T getBean(Class<T> requiredType) {
        return applicationContext.getBean(requiredType);
    }

    public static <T> T getBean(String name, Class<T> requiredType) {
        return applicationContext.getBean(name, requiredType);
    }

    public static String getCurrentEnviroment() {
        String env = StringUtils.trim(getActiveProfile());
        if (StringUtils.isEmpty(env)) {
            env = StringUtils.trim(System.getProperty("spring.profiles.active"));
        }
        if (StringUtils.isNotEmpty(env) && StringUtils.startsWithIgnoreCase(env, "dev")) {
            env = null;
        }
        return env;
    }

    private static String getActiveProfile() {
        if (environment == null) {
            return null;
        }
        String[] activeProfiles = environment.getActiveProfiles();
        return ArrayUtils.isEmpty(activeProfiles) ? null : activeProfiles[0];
    }
}