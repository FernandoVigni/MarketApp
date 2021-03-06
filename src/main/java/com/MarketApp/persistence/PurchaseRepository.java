package com.MarketApp.persistence;

import com.MarketApp.crud.PurchaseCrudRepository;
import com.MarketApp.entity.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class PurchaseRepository {
    @Autowired
    private PurchaseCrudRepository purchaseCrudRepository;

    public List<Purchase> getAllPurchases(){
        return (List<Purchase>) purchaseCrudRepository.findAll();
    }

    public Optional<Purchase> findByIdPurchase(int idPurchase){
        return purchaseCrudRepository.findById(idPurchase);
    }

    public Optional<List<Purchase>> findByAmmountLessThan5000(){
        return purchaseCrudRepository.findByAmmountLessThan(5000);
    }

    public Optional<List<Purchase>> findByAmmountGreaterThan5000(){
        return purchaseCrudRepository.findByAmmountGreaterThan(5000);
    }

    public Purchase save(Purchase purchase){
        return purchaseCrudRepository.save(purchase);
    }

    public void deleteById(int IdToDelete){
        purchaseCrudRepository.deleteById(IdToDelete);
    }

    public void deleteAll(){
        purchaseCrudRepository.deleteAll();
    }

}
