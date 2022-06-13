package com.MarketApp.services;

import com.MarketApp.entity.Client;
import com.MarketApp.persistence.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll(){
        return clientRepository.getAll();
    }

    public Optional<Client> findById(int id){
        return clientRepository.findById(id);
    }

    public Client save(Client client){
        return clientRepository.save(client);
    }

    public void delete(int idClient){
        clientRepository.delete(idClient);
    }

}
