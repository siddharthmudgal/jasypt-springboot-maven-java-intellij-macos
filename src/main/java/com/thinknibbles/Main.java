package com.thinknibbles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class Main extends SpringBootServletInitializer {

    @Autowired
    Configuration_environmentproperties configuration_environmentproperties;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
