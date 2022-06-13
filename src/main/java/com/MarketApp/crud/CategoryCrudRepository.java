package com.MarketApp.crud;

import com.MarketApp.entity.Category;
import com.MarketApp.entity.Product;
import org.springframework.data.repository.CrudRepository;


public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {
   }
