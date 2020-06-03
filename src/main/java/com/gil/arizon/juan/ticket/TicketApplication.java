package com.gil.arizon.juan.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication

//TODO mirar esto
//https://docs.spring.io/spring-security-oauth2-boot/docs/2.0.0.RC2/reference/htmlsingle/
//@EnableResourceServer
public class TicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketApplication.class, args);
	}

}
