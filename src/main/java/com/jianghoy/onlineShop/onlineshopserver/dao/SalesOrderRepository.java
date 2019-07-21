package com.jianghoy.onlineShop.onlineshopserver.dao;

import com.jianghoy.onlineShop.onlineshopserver.Entity.SalesOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesOrderRepository extends JpaRepository<SalesOrder,Long> {
    SalesOrder findSalesOrderById(Long id);

    @Override
    <S extends SalesOrder> S save(S s);
}
