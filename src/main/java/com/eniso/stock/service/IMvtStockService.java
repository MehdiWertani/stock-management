package com.eniso.stock.service;

import com.eniso.stock.entities.MvtStock;

import java.util.List;

public interface IMvtStockService {
    MvtStock save(MvtStock mvtStock);

    void delete(MvtStock mvtStock);

    MvtStock update(MvtStock mvtStock);

    MvtStock getOne(Long id);

    List<MvtStock> getAll();
}
