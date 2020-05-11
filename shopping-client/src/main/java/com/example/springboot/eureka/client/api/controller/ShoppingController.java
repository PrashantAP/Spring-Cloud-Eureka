package com.example.springboot.eureka.client.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoppingController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/online-payment/{price}")
    public String invokePaymentService(@PathVariable Integer price) {
        String url = "http://PAYMENT-SERVICE/payment-api/payNow/" + price;
        return restTemplate.getForObject(url, String.class);
    }
}
