package com.eniso.stock.service.impl;

import com.eniso.stock.dao.IVenteDao;
import com.eniso.stock.entities.Vente;
import com.eniso.stock.service.IVenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("VenteServiceImpl")
public class VenteServiceImpl implements IVenteService {
    IVenteDao iVenteDao;

    @Autowired
    public VenteServiceImpl(IVenteDao iVenteDao) {
        this.iVenteDao = iVenteDao;
    }

    @Override
    public Vente save(Vente vente) {
        return iVenteDao.save(vente);
    }

    @Override
    public void delete(Vente vente) {
        iVenteDao.delete(vente);

    }

    @Override
    public Vente update(Vente vente) {
        return iVenteDao.save(vente);
    }

    @Override
    public Vente getOne(Long id) {
        return iVenteDao.getOne(id);
    }

    @Override
    public List<Vente> getAll() {
        return iVenteDao.findAll();
    }
}
