package com.eniso.stock.service.impl;

import com.eniso.stock.dao.IClientDao;
import com.eniso.stock.entities.Client;
import com.eniso.stock.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ClientServiceImpl")
public class ClientServiceImpl implements IClientService {


    IClientDao clientDao;

    @Autowired
    public ClientServiceImpl(IClientDao clientDao) {
        this.clientDao = clientDao;
    }

    @Override
    public Client save(Client client) {
        return clientDao.save(client);
    }

    @Override
    public void delete(Client client) {
        clientDao.delete(client);
    }

    @Override
    public Client update(Client client) {
        return clientDao.save(client);
    }

    @Override
    public Client getOne(Long id) {
        return clientDao.getOne(id);
    }

    @Override
    public List<Client> getAll() {
        return clientDao.findAll();
    }

    @Override
    public Client getClientByMail(String mail) {
        return clientDao.getClientByMail(mail);
    }

    @Override
    public Client getClientByFilterCriteria(String namePattern) {
        return clientDao.getClientByFilterCriteria(namePattern);
    }
}
