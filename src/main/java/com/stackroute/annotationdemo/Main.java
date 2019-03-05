package com.stackroute.annotationdemo;

import com.stackroute.annotationdemo.config.AppConfig;
import com.stackroute.annotationdemo.config.BeanConfigurator;
import com.stackroute.annotationdemo.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        Movie movie=(Movie)ctx.getBean("movie");
        System.out.println(movie);
    }
}
