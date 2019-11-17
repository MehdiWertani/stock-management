package com.eniso.stock.service.impl;

import com.eniso.stock.dao.ICommandeClientDao;
import com.eniso.stock.entities.Client;
import com.eniso.stock.entities.CommandeClient;
import com.eniso.stock.entities.LigneCommandeClient;
import com.eniso.stock.service.ICommandeClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CommandeClientServiceImpl")
public class CommandeClientServiceImpl implements ICommandeClientService {
    ICommandeClientDao iCommandeClientDao ;
    @Autowired
    public CommandeClientServiceImpl(ICommandeClientDao iCommandeClientDao){
        this.iCommandeClientDao=iCommandeClientDao;
    }
    @Override
    public CommandeClient save(CommandeClient commandeClient) {
        return iCommandeClientDao.save(commandeClient) ;
    }

    @Override
    public CommandeClient update(CommandeClient commandeClient) {
        return iCommandeClientDao.save(commandeClient);
    }

    @Override
    public void delete(CommandeClient commandeClient) {
        iCommandeClientDao.delete(commandeClient);

    }

    @Override
    public CommandeClient getOne(Long idCommandeClient) {
        return iCommandeClientDao.getOne(idCommandeClient);
    }

    @Override
    public List<CommandeClient> getAll() {
        return iCommandeClientDao.findAll();
    }

    @Override
    public List<CommandeClient> getAllByClient(Client client) {
        return client.getCommandeClients();
    }

    @Override
    public Client getClientByIdCommandeClient(CommandeClient commandeClient) {
        return commandeClient.getClient();
    }

    @Override
    public List<LigneCommandeClient> getLigneCommandeClientByCommandeClient(CommandeClient commandeClient) {
        return commandeClient.getLigneCommandeClients();
    }

    @Override
    public CommandeClient getOneByidLigneCommandeClient(LigneCommandeClient ligneCommandeClient) {
        return ligneCommandeClient.getCommandeClient();
    }
}
