package com.MarketApp.entity;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Product {
    @Id
    @Column(name="id_product")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduct;

    @Column(name="id_category")
    private int idCategory;

    private String name;
    private double price;
    private int stock;
    private boolean state;
}
