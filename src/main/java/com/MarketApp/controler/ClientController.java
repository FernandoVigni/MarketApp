package com.MarketApp.controler;

import com.MarketApp.entity.Client;
import com.MarketApp.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<Client> getAll(){
        return clientService.getAll();
    }

    @GetMapping("/{idClient}")
    public Optional<Client> getClient(@PathVariable("idClient") int idClient){
        return clientService.findById(idClient);
    }

    @PostMapping("/save")
    public ResponseEntity<Client> save(@RequestBody Client client){
        return new ResponseEntity<>(clientService.save(client), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{idClient}")
    public void delete(@PathVariable ("idClient") int idClient){
        clientService.delete(idClient);
    }
}
