package com.eniso.stock.service.impl;

import com.eniso.stock.dao.IFournisseurDao;
import com.eniso.stock.entities.Fournisseur;
import com.eniso.stock.service.IFournisseurService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FournisseurServiceImpl implements IFournisseurService {
    IFournisseurDao iFournisseurDao ;
   @Autowired
    public FournisseurServiceImpl(IFournisseurDao iFournisseurDao) {
        this.iFournisseurDao = iFournisseurDao;
    }

    @Override
    public Fournisseur save(Fournisseur fournisseur) {
        return iFournisseurDao.save(fournisseur);
    }

    @Override
    public void delete(Fournisseur fournisseur) {
    iFournisseurDao.delete(fournisseur);
    }

    @Override
    public Fournisseur update(Fournisseur fournisseur) {

        return iFournisseurDao.save(fournisseur);
    }

    @Override
    public Fournisseur getOne(Long id) {
        return iFournisseurDao.getOne(id);
    }

    @Override
    public List<Fournisseur> getAll() {
        return iFournisseurDao.findAll();
    }
}
