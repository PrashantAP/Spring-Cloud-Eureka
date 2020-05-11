package com.example.springboot.eureka.provider.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-api")
public class PaymentController {

    @GetMapping("/payNow/{price}")
    public String payNow(@PathVariable Integer price) {
        return "Payment amount with " + price + " is successfull.";
    }
}
