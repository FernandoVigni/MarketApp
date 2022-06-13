package com.MarketApp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="shopping")
public class Shopping {

    @Id
    @Column(name="id_shop")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idShop;

    @Column(name="id_client")
    private int idClient;

    @Column(name="payment_mode")
    private String paymentMode;
}

