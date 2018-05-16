package com.xyz;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TicketBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder(TicketBootstrap.class).web(true).run(args);
    }
}
