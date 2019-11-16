package com.eniso.stock.dao;

import com.eniso.stock.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IClientDao extends JpaRepository<Client, Long> {

    Client getClientByMail(String mail);

    @Query("select clt from Client clt where clt.nom like :namePattern")
    Client getClientByFilterCriteria(String namePattern);
}
