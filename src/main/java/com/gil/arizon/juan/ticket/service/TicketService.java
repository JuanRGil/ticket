package com.gil.arizon.juan.ticket.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class TicketService {

    public void save(String currentUser, MultipartFile ticketPhoto) {
    }

    public List<Object> findAll(String currentUser) {
        return null;
    }

    public Object findOne(String currentUser, Long ticketId) {
        return null;
    }
}
