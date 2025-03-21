package com.aym.pos_api.services;

import com.aym.pos_api.model.Product;
import com.aym.pos_api.repositories.ProductRepository;
// import com.aym.pos_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // @Autowired
    // private UserRepository userRepository;

    // Method to get all products for a user
    public List<Product> getProductsByUserId(Long userId) {
        // Check if user exists
        // if (userRepository.findById(userId).isPresent()) {
        //     throw new RuntimeException("User not found");
        // }
        return productRepository.findByUserId(userId);
    }
}