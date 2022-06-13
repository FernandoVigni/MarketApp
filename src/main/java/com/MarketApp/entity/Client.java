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
}
