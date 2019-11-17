package com.eniso.stock.service;

import com.eniso.stock.entities.Client;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IClientService {
    Client save(Client client);

    void delete(Client client);

    Client update(Client client);

    Client getOne(Long id);

    List<Client> getAll();


    Client getClientByMail(String mail);

    Client getClientByFilterCriteria(String namePattern);
}
