package com.MarketApp.persistence;

import com.MarketApp.crud.ProductCrudRepository;
import com.MarketApp.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {

    @Autowired
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll() {
        return (List<Product>) productCrudRepository.findAll();
    }

    public Optional<Product> getByIDProduct(int idProduct){
        return productCrudRepository.findById(idProduct);
    }

    public List<Product> getByCategory(int idCategory){
        return  productCrudRepository.findByIdCategory(idCategory);
    }
}
