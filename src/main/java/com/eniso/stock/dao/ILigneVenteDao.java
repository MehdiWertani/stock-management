package com.eniso.stock.dao;

import com.eniso.stock.entities.LigneVente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILigneVenteDao extends JpaRepository<LigneVente,Long> {
}
