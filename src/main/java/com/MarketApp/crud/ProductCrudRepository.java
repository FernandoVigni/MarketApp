package com.MarketApp.crud;

import com.MarketApp.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductCrudRepository extends CrudRepository<Product,Integer> {
    List<Product> findByIdCategory(int idCategory);
}
