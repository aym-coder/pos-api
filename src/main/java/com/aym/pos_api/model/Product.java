package com.aym.pos_api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private int tax;
    private float price;
    private Long barCode;
    private Long cabysCode;
    private String medicineReg;
    private List<String> pharmForm;

    // @ManyToOne
    // @JoinColumn(name = "user_id")
    // private User user;
}