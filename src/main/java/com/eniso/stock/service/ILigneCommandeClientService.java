package com.eniso.stock.service;

import com.eniso.stock.entities.LigneCommandeClient;

import java.util.List;

public interface ILigneCommandeClientService {
    LigneCommandeClient save(LigneCommandeClient ligneCommandeClient);

    void delete(LigneCommandeClient ligneCommandeClient);

    LigneCommandeClient update(LigneCommandeClient ligneCommandeClient);

    LigneCommandeClient getOne(Long id);

    List<LigneCommandeClient> getAll();
}
