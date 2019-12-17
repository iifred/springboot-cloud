package com.springboot.springcloud.consumeruser.serivce;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TicketService {

    @LoadBalanced //开启负载均衡
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


}
