package com.eniso.stock.service.impl;

import com.eniso.stock.dao.ICatagoryDao;
import com.eniso.stock.entities.Catagory;
import com.eniso.stock.service.ICatagoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("ICatagoryServiceImpl")
public class ICatagoryServiceImpl implements ICatagoryService {
 ICatagoryDao iCatagoryDao ;
   @Autowired
    public ICatagoryServiceImpl(ICatagoryDao iCatagoryDao) {
        this.iCatagoryDao = iCatagoryDao;
    }

    @Override
    public Catagory save(Catagory catagory) {
        return iCatagoryDao.save(catagory);
    }

    @Override
    public void delete(Catagory catagory) {
         iCatagoryDao.delete(catagory);
    }

    @Override
    public Catagory update(Catagory catagory) {
        return iCatagoryDao.save(catagory);
    }

    @Override
    public Catagory getOne(Long id) {
        return iCatagoryDao.getOne(id);
    }

    @Override
    public List<Catagory> getAll() {
        return iCatagoryDao.findAll();
    }
}
