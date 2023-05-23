package com.cec;


import com.cec.customer.CustomerController;
import com.cec.customer.CustomerDataAccessService;
import com.cec.customer.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SpringBootApplication
//@ComponentScan(basePackages = "com.cec")
//@EnableAutoConfiguration
//@Configuration


public class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }
}
