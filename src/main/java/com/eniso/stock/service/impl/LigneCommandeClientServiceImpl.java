package com.eniso.stock.service.impl;

import com.eniso.stock.dao.ILigneCommandeClientDao;
import com.eniso.stock.entities.LigneCommandeClient;
import com.eniso.stock.service.ILigneCommandeClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("LigneCommandeClientServiceImpl")
public class LigneCommandeClientServiceImpl implements ILigneCommandeClientService {
    ILigneCommandeClientDao iLigneCommandeClientDao ;
        @Autowired
    public LigneCommandeClientServiceImpl(ILigneCommandeClientDao iLigneCommandeClientDao) {
        this.iLigneCommandeClientDao = iLigneCommandeClientDao;
    }

    @Override
    public LigneCommandeClient save(LigneCommandeClient ligneCommandeClient) {
        return iLigneCommandeClientDao.save(ligneCommandeClient);
    }

    @Override
    public void delete(LigneCommandeClient ligneCommandeClient) {
       iLigneCommandeClientDao.delete(ligneCommandeClient);
    }

    @Override
    public LigneCommandeClient update(LigneCommandeClient ligneCommandeClient) {
        return iLigneCommandeClientDao.save(ligneCommandeClient);
    }

    @Override
    public LigneCommandeClient getOne(Long id) {
        return iLigneCommandeClientDao.getOne(id);
    }

    @Override
    public List<LigneCommandeClient> getAll() {
        return iLigneCommandeClientDao.findAll();
    }
}
