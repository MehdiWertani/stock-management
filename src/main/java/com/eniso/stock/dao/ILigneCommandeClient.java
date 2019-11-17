package com.eniso.stock.dao;

import com.eniso.stock.entities.LigneCommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILigneCommandeClient extends JpaRepository<LigneCommandeClient,Long> {
}
