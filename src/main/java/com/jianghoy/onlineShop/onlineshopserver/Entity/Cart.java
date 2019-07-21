package com.jianghoy.onlineShop.onlineshopserver.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "carts")
public class Cart implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "carts",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CartItem> cartItemList;
    private double totalPrice;
}
