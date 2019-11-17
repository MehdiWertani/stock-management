package com.eniso.stock.service.impl;

import com.eniso.stock.dao.ILigneVenteDao;
import com.eniso.stock.entities.LigneVente;
import com.eniso.stock.service.ILigneVenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("LigneVenteServiceImpl")
public class LigneVenteServiceImpl implements ILigneVenteService {
    ILigneVenteDao iLigneVenteDao;

    @Autowired
    public LigneVenteServiceImpl(ILigneVenteDao iLigneVenteDao) {
        this.iLigneVenteDao = iLigneVenteDao;
    }

    @Override
    public LigneVente save(LigneVente ligneVente) {
        return iLigneVenteDao.save(ligneVente);
    }

    @Override
    public void delete(LigneVente ligneVente) {
        iLigneVenteDao.delete(ligneVente);
    }

    @Override
    public LigneVente update(LigneVente ligneVente) {
        return iLigneVenteDao.save(ligneVente);
    }

    @Override
    public LigneVente getOne(Long id) {
        return iLigneVenteDao.getOne(id);
    }

    @Override
    public List<LigneVente> getAll() {
        return iLigneVenteDao.findAll();
    }
}
