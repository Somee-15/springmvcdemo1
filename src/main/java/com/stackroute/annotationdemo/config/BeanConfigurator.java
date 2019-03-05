package com.stackroute.annotationdemo.config;

import com.stackroute.annotationdemo.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.stackroute.annotationdemo")
public class BeanConfigurator {
    @Bean(name="movie")
    public Movie getMovieBean(){
        return new Movie(1,"Salam namastey");
    }

}
