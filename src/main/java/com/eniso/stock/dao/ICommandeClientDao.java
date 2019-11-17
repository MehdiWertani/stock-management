package com.eniso.stock.dao;

import com.eniso.stock.entities.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICommandeClientDao extends JpaRepository<CommandeClient,Long> {


}
