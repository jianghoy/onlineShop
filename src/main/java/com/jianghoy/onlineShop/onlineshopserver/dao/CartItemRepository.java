package com.jianghoy.onlineShop.onlineshopserver.dao;

import com.jianghoy.onlineShop.onlineshopserver.Entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem,Long> {

    @Override
    <S extends CartItem> S save(S s);

    @Override
    void deleteById(Long aLong);

    @Override
    void deleteAll(Iterable<? extends CartItem> iterable);
}
