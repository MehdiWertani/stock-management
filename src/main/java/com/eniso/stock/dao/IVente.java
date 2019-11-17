package com.eniso.stock.dao;

import com.eniso.stock.entities.Vente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVente extends JpaRepository<Vente,Long> {
}
