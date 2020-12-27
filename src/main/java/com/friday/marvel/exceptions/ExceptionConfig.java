package com.friday.marvel.exceptions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ExceptionConfig {

    @Bean
    @Primary
    public FridayPageableValidator fridayPageableValidator() {
        return new FridayPageableValidator();
    }

    @Bean
    public JarvisPageableValidator jarvisPageableValidator() {
        return new JarvisPageableValidator();
    }
}
