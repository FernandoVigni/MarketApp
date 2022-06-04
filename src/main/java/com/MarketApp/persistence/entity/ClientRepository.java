package com.MarketApp.persistence.entity;

import com.MarketApp.entity.Client;
import com.MarketApp.crud.ClientCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientRepository {
    @Autowired
    private ClientCrudRepository clientCrudRepository;

    public List<Client> getAll(){
        return  (List<Client>) clientCrudRepository.findAll();
    }

    public Client save(Client client){
        return clientCrudRepository.save(client);
    }

    public void delete(int idClient){
        clientCrudRepository.deleteById(idClient);
    }
}
