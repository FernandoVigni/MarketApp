package com.MarketApp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="categorys")
public class Category {
    @Id
    @Column(name="id_category")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategory;

    private String description;
}
