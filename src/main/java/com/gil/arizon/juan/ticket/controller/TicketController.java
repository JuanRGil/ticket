package com.gil.arizon.juan.ticket.controller;

import com.gil.arizon.juan.ticket.service.TicketService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/ticket")
@Slf4j
public class TicketController {

    //TODO mirar esto
    //https://docs.spring.io/spring-security-oauth2-boot/docs/2.0.0.RC2/reference/htmlsingle/

    @Autowired
    private TicketService ticketService;

    @PostMapping
    @PreAuthorize("isAuthenticated()")
    public ResponseEntity<?> save(Authentication authObject, @RequestBody MultipartFile ticketPhoto) {
        String currentUser = (String) authObject.getPrincipal();
        ticketService.save(currentUser, ticketPhoto);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    @PreAuthorize("isAuthenticated()")
    public ResponseEntity<?> find(Authentication authObject) {
        String currentUser = (String) authObject.getPrincipal();
        List<Object> tickets = ticketService.findAll(currentUser);
        return ResponseEntity.ok().build();

    }

    @GetMapping("/{id}")
    @PreAuthorize("isAuthenticated()")
    public ResponseEntity<?> find(Authentication authObject, @PathVariable("id") Long ticketId) {
        String currentUser = (String) authObject.getPrincipal();
        Object found =  ticketService.findOne(currentUser, ticketId);
        return ResponseEntity.ok().build();
    }
}
