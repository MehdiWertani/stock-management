package com.eniso.stock.service;

import com.eniso.stock.entities.CommandeFournisseur;

import java.util.List;

public interface ICommandeFournisseurService {
    CommandeFournisseur save(CommandeFournisseur commandeFournisseur);

    void delete(CommandeFournisseur commandeFournisseur);

    CommandeFournisseur update(CommandeFournisseur commandeFournisseur);

    CommandeFournisseur getOne(Long id);

    List<CommandeFournisseur> getAll();
}
