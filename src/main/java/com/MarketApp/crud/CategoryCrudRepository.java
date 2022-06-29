package com.MarketApp.crud;

import com.MarketApp.entity.Category;
import org.springframework.data.repository.CrudRepository;


public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {
   }
