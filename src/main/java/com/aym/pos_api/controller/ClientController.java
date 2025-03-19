package com.aym.pos_api.controller;

import com.aym.pos_api.model.Client;
import com.aym.pos_api.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/user/{userId}")
    public List<Client> getClientsByUser(@PathVariable Long userId) {
        return clientService.getClientsByUserId(userId);
    }
}
