package com.jianghoy.onlineShop.onlineshopserver.dao;

import com.jianghoy.onlineShop.onlineshopserver.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
