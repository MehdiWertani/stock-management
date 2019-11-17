package com.eniso.stock.dao;

import com.eniso.stock.entities.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFournisseur extends JpaRepository<Fournisseur,Long> {
}
