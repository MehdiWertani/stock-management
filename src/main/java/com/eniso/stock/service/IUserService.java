package com.eniso.stock.service;

import com.eniso.stock.entities.User;

import java.util.List;

public interface IUserService {
    User save(User user);

    void delete(User user);

    User update(User user);

    User getOne(Long id);

    List<User> getAll();
}
