package com.MarketApp.ClientControler;

import com.MarketApp.entity.Client;
import com.MarketApp.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientControler {

    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<Client> getAll(){
        return clientService.getAll();
    }

                            @GetMapping("/prueba")
                            public String prueba(){
                                return "Exito!";
                            }
    @PostMapping("/save")
    public Client save(@RequestBody Client client){
        return clientService.save(client);
    }

    public void delete(int idClient){
        clientService.delete(idClient);
    }

}
