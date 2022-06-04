package com.MarketApp.persistence;

import com.MarketApp.crud.ClientReposiroty;
import com.MarketApp.entity.Client;
import com.MarketApp.crud.ClientCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository implements ClientReposiroty {
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
