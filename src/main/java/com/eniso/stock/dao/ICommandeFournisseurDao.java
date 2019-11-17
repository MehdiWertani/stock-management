package com.eniso.stock.dao;

import com.eniso.stock.entities.CommandeFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommandeFournisseurDao extends JpaRepository<CommandeFournisseur,Long> {
}
