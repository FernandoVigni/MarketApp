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

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
