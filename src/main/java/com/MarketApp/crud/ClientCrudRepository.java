package com.MarketApp.crud;

import com.MarketApp.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository<Client, Integer> {

}
