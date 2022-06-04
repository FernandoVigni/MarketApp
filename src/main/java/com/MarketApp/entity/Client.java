package com.MarketApp.entity;

import javax.persistence.*;

@Entity
@Table(name="clients")
public class Client {

    @Id
    @Column(name="id_client")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;
}
