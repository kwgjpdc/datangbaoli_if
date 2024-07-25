package com.bywin.baoli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class BaoliApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaoliApiApplication.class, args);
    }

}
