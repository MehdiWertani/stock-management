package com.eniso.stock.service;

import com.eniso.stock.entities.Vente;

import java.util.List;

public interface IVenteService {
    Vente save(Vente vente);

    void delete(Vente vente);

    Vente update(Vente vente);

    Vente getOne(Long id);

    List<Vente> getAll();
}
