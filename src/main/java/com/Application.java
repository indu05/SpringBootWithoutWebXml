package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@EnableAutoConfiguration
@ComponentScan
/*@ComponentScan("com.codenvy")
@EnableWebMvc*/
public class Application  extends SpringBootServletInitializer{
  
   public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
