package com.eniso.stock.service;

import com.eniso.stock.entities.Catagory;

import java.util.List;

public interface ICatagoryService {
    Catagory save(Catagory catagory);

    void delete(Catagory catagory);

    Catagory update(Catagory catagory);

    Catagory getOne(Long id);

    List<Catagory> getAll();
}
