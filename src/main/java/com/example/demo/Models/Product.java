package com.example.demo.Models;

import java.util.UUID;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Component
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue

    private UUID user_id;
    private String title;
    private String description;
    private Double price;
   
    
}
