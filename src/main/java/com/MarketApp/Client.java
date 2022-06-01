package com.MarketApp;

import javax.persistence.*;

@Entity
@Table(name="Clients")
public class Client {

    @Id
    @Column(name="Id_product")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;
}
