package com.springboot.springcloud.consumeruser.controller;

import com.springboot.springcloud.consumeruser.serivce.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TickerController {
    @Autowired
    TicketService ticketService;

    @GetMapping("buyTicket")
    public String getTicket(String name){
        return name + "购买了：" + ticketService.restTemplate().getForEntity("http://PROVIDER-TICKET/ticket", String.class);
    }
}
