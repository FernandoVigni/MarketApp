package com.MarketApp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="clients")
public class Client {

    @Id
    @Column(name="id_client")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient;

    @Column(name="second_name")
    private String secondName;

    private String name;
    private String addres;
    private String email;

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
