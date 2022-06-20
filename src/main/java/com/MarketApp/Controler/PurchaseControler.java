package com.MarketApp.Controler;

import com.MarketApp.entity.Purchase;
import com.MarketApp.services.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/purchase")
public class PurchaseControler {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/all")
    public List<Purchase> getAllPurchase(){
        return purchaseService.getAllPurchases();
    }

    @GetMapping("/{idPurchase}")
    public Optional<Purchase> findByIdPurchase (@PathVariable ("idPurchase") int idPurchase){
        return purchaseService.findByIdPurchase(idPurchase);
    }

    @PostMapping("/save")
    public Purchase save(Purchase purchase){
        return purchaseService.save(purchase);
    }

    @DeleteMapping("/deleteAll")
    public void delteAll(){
        purchaseService.deleteAll();
    }
}
