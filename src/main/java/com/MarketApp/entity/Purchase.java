package com.MarketApp.entity;

import javax.persistence.*;

@Entity
@Table(name="shopping")
public class Purchase {

    @Id
    @Column(name="id_shop")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPurchase;

    @Column(name="id_client")
    private int idClient;

    @Column(name="payment_mode")
    private String paymentMode;

    public int getIdPurchase() {
        return idPurchase;
    }

    public void setIdPurchase(int idPurchase) {
        this.idPurchase = idPurchase;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
}


