package com.eniso.stock.dao;

import com.eniso.stock.entities.Catagory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICatagory extends JpaRepository<Catagory,Long> {

}
