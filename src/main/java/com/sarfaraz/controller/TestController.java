package com.sarfaraz.controller;

import com.sarfaraz.bean.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/greeting")
    public Customer getCustomer() {
        return new Customer(1,"Sarfaraz Chohan","Karachi,Pakistan");
    }

}
