package com.eniso.stock.service;

import com.eniso.stock.entities.LigneVente;

import java.util.List;

public interface ILigneVenteService {
    LigneVente save(LigneVente ligneVente);

    void delete(LigneVente ligneVente);

    LigneVente update(LigneVente ligneVente);

    LigneVente getOne(Long id);

    List<LigneVente> getAll();

}
