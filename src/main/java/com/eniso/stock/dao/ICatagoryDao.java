package com.eniso.stock.dao;

import com.eniso.stock.entities.Catagory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICatagoryDao extends JpaRepository<Catagory,Long> {

}
