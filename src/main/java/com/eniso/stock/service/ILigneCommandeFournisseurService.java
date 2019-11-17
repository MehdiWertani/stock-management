package com.eniso.stock.service;

import com.eniso.stock.entities.LigneCommandeFournisseur;

import java.util.List;

public interface ILigneCommandeFournisseurService {
    LigneCommandeFournisseur save(LigneCommandeFournisseur ligneCommandeFournisseur);

    void delete(LigneCommandeFournisseur ligneCommandeFournisseur);

    LigneCommandeFournisseur update(LigneCommandeFournisseur ligneCommandeFournisseur);

    LigneCommandeFournisseur getOne(Long id);

    List<LigneCommandeFournisseur> getAll();
}
