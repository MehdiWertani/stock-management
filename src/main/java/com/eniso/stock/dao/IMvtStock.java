package com.eniso.stock.dao;

import com.eniso.stock.entities.MvtStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMvtStock extends JpaRepository<MvtStock,Long> {
}
