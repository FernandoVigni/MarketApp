package com.MarketApp.services;

import com.MarketApp.entity.Product;
import com.MarketApp.persistence.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public Optional<Product> getByIDProduct(int idProduct){
        return productRepository.getByIDProduct(idProduct);
    }

    public List<Product> getByCategory(int idCategory) {
        return productRepository.getByCategory(idCategory);
    }
}
