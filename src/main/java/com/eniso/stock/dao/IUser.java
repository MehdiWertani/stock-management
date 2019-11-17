package com.eniso.stock.dao;

import com.eniso.stock.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUser extends JpaRepository<User,Long> {
}
