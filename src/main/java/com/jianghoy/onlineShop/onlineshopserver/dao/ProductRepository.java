package com.jianghoy.onlineShop.onlineshopserver.dao;

import com.jianghoy.onlineShop.onlineshopserver.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepository  extends JpaRepository<Product,Long> {
    @Override
    <S extends Product> S save(S s);

    @Override
    void deleteById(Long id);

    @Override
    Optional<Product> findById(Long id);

    @Override
    List<Product> findAll();

    @Query("")
    void updateProduct(Product product);
}
