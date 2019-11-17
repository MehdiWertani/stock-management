package com.eniso.stock.service.impl;

import com.eniso.stock.dao.ILigneCommandeFournisseurDao;
import com.eniso.stock.entities.LigneCommandeFournisseur;
import com.eniso.stock.service.ILigneCommandeFournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("LigneCommandeFournisseurServiceImpl")
public class LigneCommandeFournisseurServiceImpl implements ILigneCommandeFournisseurService {
    ILigneCommandeFournisseurDao iLigneCommandeFournisseurDao;

    @Autowired
    public LigneCommandeFournisseurServiceImpl(ILigneCommandeFournisseurDao iLigneCommandeFournisseurDao) {
        this.iLigneCommandeFournisseurDao = iLigneCommandeFournisseurDao;
    }


    @Override
    public LigneCommandeFournisseur save(LigneCommandeFournisseur ligneCommandeFournisseur) {
        return iLigneCommandeFournisseurDao.save(ligneCommandeFournisseur);
    }

    @Override
    public void delete(LigneCommandeFournisseur ligneCommandeFournisseur) {
               iLigneCommandeFournisseurDao.delete(ligneCommandeFournisseur);
    }

    @Override
    public LigneCommandeFournisseur update(LigneCommandeFournisseur ligneCommandeFournisseur) {
        return iLigneCommandeFournisseurDao.save(ligneCommandeFournisseur);
    }

    @Override
    public LigneCommandeFournisseur getOne(Long id) {
        return iLigneCommandeFournisseurDao.getOne(id);
    }

    @Override
    public List<LigneCommandeFournisseur> getAll() {
        return iLigneCommandeFournisseurDao.findAll();
    }
}
