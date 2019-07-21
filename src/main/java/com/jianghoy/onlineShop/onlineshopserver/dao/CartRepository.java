package com.jianghoy.onlineShop.onlineshopserver.dao;

import com.jianghoy.onlineShop.onlineshopserver.Entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart,Long> {

    @Override
    Optional<Cart> findById(Long aLong);


}
