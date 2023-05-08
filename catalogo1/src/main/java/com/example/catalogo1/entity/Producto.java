package com.example.catalogo1.entity;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    private String ProductName;
}