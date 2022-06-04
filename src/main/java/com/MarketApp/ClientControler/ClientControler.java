package com.MarketApp.ClientControler;

import com.MarketApp.entity.Client;
import com.MarketApp.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientControler {

    @Autowired
    private ClientService clientService;

    public List<Client> getAll(){
        return clientService.getAll();
    }

    public Client save(Client client){
        return clientService.save(client);
    }

    public void delete(int idClient){
        clientService.delete(idClient);
    }

}
