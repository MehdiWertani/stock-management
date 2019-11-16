package com.eniso.stock.dao.impl;

import com.eniso.stock.dao.ICommandeClientDao;
import com.eniso.stock.entities.CommandeClient;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
@SuppressWarnings("all")
@Repository("CommandeClientDaoImpl")
public class CommandeClientDaoImpl implements ICommandeClientDao {


    @PersistenceContext
    EntityManager em;

    @Override
    public CommandeClient save(CommandeClient commandeClient) {
        em.persist(commandeClient);
        return commandeClient;
    }

    @Override
    public void delete(CommandeClient commandeClient) {
em.remove(commandeClient);
    }

    @Override
    public CommandeClient update(CommandeClient commandeClient) {
     return    em.merge(commandeClient);
    }

    @Override
    public CommandeClient getOne(String code) {
        //SQL native
        /**
         * select * from CommandeClient where CommandeClient.code = fgfgf
         * select cmd from CommandeClient cmd where CommandeClient.code = fgfgf ==> requete with alias
         */
        /*Query query1 = em.createNativeQuery("select * from CommandeClient where CommandeClient.code = ?1 and CommandeClient.idCommandeClient= ?2");
        query1.setParameter(1, code);
        query1.setParameter(2, idCommandeClient);*/
        Query query = em.createQuery("SELECT param FROM CommandeClient param WHERE param.code = :codeParam");
        query.setParameter("codeParam", code);
        return (CommandeClient) query.getSingleResult();
    }

    @Override
    public List<CommandeClient> getAll() {
        Query query =em.createQuery("SELECT  param FROM  CommandeClient param");
        return query.getResultList();


    }
}
