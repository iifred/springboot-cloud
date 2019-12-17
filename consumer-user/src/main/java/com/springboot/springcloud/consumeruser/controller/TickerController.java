package com.springboot.springcloud.consumeruser.controller;

import com.springboot.springcloud.consumeruser.serivce.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TickerController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("buyTicket")
    public String getTicket(String name){
        return name + "购买了：" + restTemplate.getForObject("http://PROVIDER-TICKET/ticket", String.class);
    }
}
