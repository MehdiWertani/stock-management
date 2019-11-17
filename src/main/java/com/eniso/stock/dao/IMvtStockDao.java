package com.eniso.stock.dao;

import com.eniso.stock.entities.MvtStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMvtStockDao extends JpaRepository<MvtStock,Long> {
}
