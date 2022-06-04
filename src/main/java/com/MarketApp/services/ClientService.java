package com.MarketApp.services;

import com.MarketApp.Client;
import com.MarketApp.persistence.entity.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll(){
        return clientRepository.getAll();
    }

    public Client save(Client client){
        return clientRepository.save(client);
    }

    public void delete(int idClient){
        clientRepository.delete(idClient);
    }

}
