package com.eniso.stock.service;

import com.eniso.stock.entities.Fournisseur;

import java.util.List;

public interface IFournisseurService {
    Fournisseur save(Fournisseur fournisseur);

    void delete(Fournisseur fournisseur);

    Fournisseur update(Fournisseur fournisseur);

    Fournisseur getOne(Long id);

    List<Fournisseur> getAll();
}
