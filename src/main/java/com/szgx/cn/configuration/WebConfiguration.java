package com.szgx.cn.configuration;

import org.apache.catalina.manager.StatusManagerServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.annotation.WebServlet;


@Configuration
public class WebConfiguration {
    @Bean
    ServletRegistrationBean h2servletRegistration(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new StatusManagerServlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
    }
}
