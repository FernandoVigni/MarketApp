package com.MarketApp.crud;

import com.MarketApp.entity.Purchase;
import java.util.List;
import java.util.Optional;

public interface PurchaseCrudRepository extends org.springframework.data.repository.CrudRepository <Purchase, Integer>{

    Optional<List<Purchase>> findByAmmountLessThan(double ammount);
    Optional<List<Purchase>> findByAmmountGreaterThan(double ammount);
}
