package com.eniso.stock.service.impl;

import com.eniso.stock.dao.IUserDao;
import com.eniso.stock.entities.User;
import com.eniso.stock.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserServiceImpl")
public class UserServiceImpl implements IUserService {
    IUserDao iUserDao;

    @Autowired
    public UserServiceImpl(IUserDao iUserDao) {
        this.iUserDao = iUserDao;
    }

    @Override
    public User save(User user) {
        return iUserDao.save(user);
    }

    @Override
    public void delete(User user) {
        iUserDao.delete(user);

    }

    @Override
    public User update(User user) {
        return iUserDao.save(user);
    }

    @Override
    public User getOne(Long id) {
        return iUserDao.getOne(id
        );
    }

    @Override
    public List<User> getAll() {
        return iUserDao.findAll();
    }
}
