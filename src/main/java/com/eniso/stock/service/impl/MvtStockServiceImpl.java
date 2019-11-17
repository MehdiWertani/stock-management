package com.eniso.stock.service.impl;

import com.eniso.stock.dao.IMvtStockDao;
import com.eniso.stock.entities.MvtStock;
import com.eniso.stock.service.IMvtStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MvtStockServiceImpl")
public class MvtStockServiceImpl implements IMvtStockService {
    IMvtStockDao iMvtStockDao;

    @Autowired
    public MvtStockServiceImpl(IMvtStockDao iMvtStockDao) {
        this.iMvtStockDao = iMvtStockDao;
    }

    @Override
    public MvtStock save(MvtStock mvtStock) {
        return iMvtStockDao.save(mvtStock);
    }

    @Override
    public void delete(MvtStock mvtStock) {
        iMvtStockDao.delete(mvtStock);
    }

    @Override
    public MvtStock update(MvtStock mvtStock) {
        return iMvtStockDao.save(mvtStock);
    }

    @Override
    public MvtStock getOne(Long id) {
        return iMvtStockDao.getOne(id);
    }

    @Override
    public List<MvtStock> getAll() {
        return iMvtStockDao.findAll();
    }
}
