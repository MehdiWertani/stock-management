package com.eniso.stock.dao;

import com.eniso.stock.entities.LigneCommandeFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILigneCommandeFournisseurDao extends JpaRepository<LigneCommandeFournisseur,Long> {
}
