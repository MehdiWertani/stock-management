package com.eniso.stock.dao;

import com.eniso.stock.entities.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFournisseurDao extends JpaRepository<Fournisseur,Long> {
}
