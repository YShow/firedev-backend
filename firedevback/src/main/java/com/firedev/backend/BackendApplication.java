package com.firedev.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SuppressWarnings("checkstyle:hideutilityclassconstructor")
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class BackendApplication {

    /**
     * incializador do spring.
     * @param args
     */
    public static void main(final String[] args) {

        SpringApplication.run(BackendApplication.class, args);
    }

}
