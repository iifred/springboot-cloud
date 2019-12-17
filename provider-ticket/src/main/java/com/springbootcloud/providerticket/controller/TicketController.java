package com.springbootcloud.providerticket.controller;

import com.springbootcloud.providerticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
    @Autowired
    TicketService ticketService;

    @GetMapping("ticket")
    public String getTciket(){
        String ticket = ticketService.getTicket();
        return ticket;
    }
}
