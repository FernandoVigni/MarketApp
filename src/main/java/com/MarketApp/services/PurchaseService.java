package com.MarketApp.services;

import com.MarketApp.entity.Purchase;
import com.MarketApp.persistence.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {
    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase> getAllPurchases(){
        return purchaseRepository.getAllPurchases();
    }

    public Optional<Purchase> findByIdPurchase(int idPurchase) {
        return purchaseRepository.findByIdPurchase(idPurchase);
    }

    public Purchase save(Purchase purchase){
        return purchaseRepository.save(purchase);
    }

    public void deleteAll(){
        purchaseRepository.deleteAll();
    }
}