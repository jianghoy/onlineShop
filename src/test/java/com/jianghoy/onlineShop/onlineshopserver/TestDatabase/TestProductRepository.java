package com.jianghoy.onlineShop.onlineshopserver.TestDatabase;

import com.jianghoy.onlineShop.onlineshopserver.Entity.Product;
import com.jianghoy.onlineShop.onlineshopserver.dao.ProductRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TestProductRepository {
    @Autowired
    private ProductRepository productRepository;
    private Product sonyASevenRIV;

    @Before
    public void setUp(){
        Product sonyASevenRIV = new Product();
        sonyASevenRIV.setProductCategory("camera");
        sonyASevenRIV.setProductDescription("latest sony camera");
        sonyASevenRIV.setProductManufacturer("Sony");
        sonyASevenRIV.setProductName("A7R IV");
        sonyASevenRIV.setProductPrice(3500.0);
        sonyASevenRIV.setUnitStock("10");

        Product pelikanM805 = new Product();
        pelikanM805.setProductCategory("fountain pen");
        pelikanM805.setProductDescription("Like the color of sand dunes under a midnight moon, the interplay of blues in each 805 Blue Dunes writing instrument is unique.");
        pelikanM805.setProductPrice(620.0);
        pelikanM805.setProductName("Pelikan M805 Fountain Pen - Blue Dunes (Special Edition)");
        pelikanM805.setProductManufacturer("Pelikan");
        pelikanM805.setUnitStock("1");

    }
    @Test
    public void testSave() {
        sonyASevenRIV = productRepository.save(sonyASevenRIV);
        assertThat(productRepository.findById(sonyASevenRIV.getId()))
                .get().isEqualTo(sonyASevenRIV);


    }
}
