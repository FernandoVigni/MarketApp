package com.MarketApp.crud;

import com.MarketApp.entity.Client;

import java.util.List;

public interface ClientReposiroty {
    List<Client> getAll();
    Client save(Client client);
    void delete(int idClient);
}
