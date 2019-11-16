package com.eniso.stock.dao;

import com.eniso.stock.entities.CommandeClient;

import java.util.List;

public interface ICommandeClientDao {
    CommandeClient save(CommandeClient commandeClient);

    void delete(CommandeClient commandeClient);

    CommandeClient update(CommandeClient commandeClient);

    CommandeClient getOne(String code);

    List<CommandeClient> getAll();
}
