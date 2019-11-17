package com.eniso.stock.dao;

import com.eniso.stock.entities.Vente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVenteDao extends JpaRepository<Vente,Long> {
}
