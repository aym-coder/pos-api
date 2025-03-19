package com.aym.pos_api.services;

import com.aym.pos_api.model.Client;
import com.aym.pos_api.repositories.ClientRepository;
import com.aym.pos_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private UserRepository userRepository;

    // Method to get all clients for a user
    public List<Client> getClientsByUserId(Long userId) {
        // Check if user exists
        if (userRepository.findById(userId).isPresent()) {
            throw new RuntimeException("User not found");
        }
        return clientRepository.findByUserId(userId);
    }
}
