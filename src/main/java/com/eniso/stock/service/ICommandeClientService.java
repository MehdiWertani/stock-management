package com.eniso.stock.service;

import com.eniso.stock.entities.Client;
import com.eniso.stock.entities.CommandeClient;
import com.eniso.stock.entities.LigneCommandeClient;

import java.util.List;

public interface ICommandeClientService {
CommandeClient save(CommandeClient commandeClient);
CommandeClient update(CommandeClient commandeClient);
void delete(CommandeClient commandeClient);
CommandeClient getOne(Long idCommandeClient);
List<CommandeClient> getAll();
List<CommandeClient> getAllByClient(Client client );
Client getClientByIdCommandeClient(CommandeClient commandeClient);
List<LigneCommandeClient> getLigneCommandeClientByCommandeClient(CommandeClient commandeClient);
CommandeClient getOneByidLigneCommandeClient(LigneCommandeClient ligneCommandeClient);
}
