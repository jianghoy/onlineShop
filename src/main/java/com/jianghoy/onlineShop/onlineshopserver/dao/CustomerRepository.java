package com.jianghoy.onlineShop.onlineshopserver.dao;

import com.jianghoy.onlineShop.onlineshopserver.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

    @Override
    <S extends Customer> S save(S s);

    Customer findCustomerByUser_EmailId(String emailId);
}
