package com.eniso.stock.service.impl;

import com.eniso.stock.dao.ICommandeFournisseurDao;
import com.eniso.stock.entities.CommandeFournisseur;
import com.eniso.stock.service.ICommandeFournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CommandeFournisseurServiceImpl")
public class CommandeFournisseurServiceImpl implements ICommandeFournisseurService {
ICommandeFournisseurDao iCommandeFournisseurDao;
   @Autowired
    public CommandeFournisseurServiceImpl(ICommandeFournisseurDao iCommandeFournisseurDao) {
        this.iCommandeFournisseurDao = iCommandeFournisseurDao;
    }

    @Override
    public CommandeFournisseur save(CommandeFournisseur commandeFournisseur) {
        return iCommandeFournisseurDao.save(commandeFournisseur);
    }

    @Override
    public void delete(CommandeFournisseur commandeFournisseur) {
       iCommandeFournisseurDao.delete(commandeFournisseur);

    }

    @Override
    public CommandeFournisseur update(CommandeFournisseur commandeFournisseur) {
        return iCommandeFournisseurDao.save(commandeFournisseur);
    }

    @Override
    public CommandeFournisseur getOne(Long id) {
        return iCommandeFournisseurDao.getOne(id);
    }

    @Override
    public List<CommandeFournisseur> getAll() {
        return iCommandeFournisseurDao.findAll();
    }
}
