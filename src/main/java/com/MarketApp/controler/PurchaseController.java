package com.MarketApp.controler;

import com.MarketApp.entity.Purchase;
import com.MarketApp.services.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

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

    @GetMapping("/purchaseAmmountLessThan5000")
    public Optional<List<Purchase>> findByAmmountLessThan5000(){
        return purchaseService.findByAmmountLessThan5000();
   }

    @GetMapping("/purchaseAmmountGreaterThan5000")
    public Optional<List<Purchase>> findByAmmountGreaterThan5000(){
        return purchaseService.findByAmmountGreaterThan5000();
    }

    @PostMapping("/save")
    public ResponseEntity<Purchase> save(@RequestBody Purchase purchase){
        return new ResponseEntity<>(purchaseService.save(purchase), HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteAll")
    public void delteAll(){
        purchaseService.deleteAll();
    }

    @DeleteMapping("/delete/{idToDelete}")
    public void deleteById(@PathVariable ("idToDelete") int idToDelete){
        purchaseService.deleteById(idToDelete);
    }
}
