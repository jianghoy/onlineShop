package com.jianghoy.onlineShop.onlineshopserver.TestDatabase;

import com.jianghoy.onlineShop.onlineshopserver.Entity.Product;
import com.jianghoy.onlineShop.onlineshopserver.dao.ProductRepository;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestProductRepository {
    @Autowired
    private ProductRepository productRepository;
    private Product sonyASevenRIV;
    private Product pelikanM805;

    @Test
    public void aSetUp(){
        sonyASevenRIV = new Product();
        sonyASevenRIV.setProductCategory("camera");
        sonyASevenRIV.setProductDescription("latest sony camera");
        sonyASevenRIV.setProductManufacturer("Sony");
        sonyASevenRIV.setProductName("A7R IV");
        sonyASevenRIV.setProductPrice(3500.0);
        sonyASevenRIV.setUnitStock("10");

        pelikanM805 = new Product();
        pelikanM805.setProductCategory("fountain pen");
        pelikanM805.setProductDescription("Like the color of sand dunes under a midnight moon, the interplay of blues in each 805 Blue Dunes writing instrument is unique.");
        pelikanM805.setProductPrice(620.0);
        pelikanM805.setProductName("Pelikan M805 Fountain Pen - Blue Dunes (Special Edition)");
        pelikanM805.setProductManufacturer("Pelikan");
        pelikanM805.setUnitStock("1");

    }
    @Test
    public void bTestSave() {
        // done
        sonyASevenRIV = productRepository.save(sonyASevenRIV);
        assertThat(productRepository.findById(sonyASevenRIV.getId()))
                .get().isEqualTo(sonyASevenRIV);

        pelikanM805 = productRepository.save(pelikanM805);
        assertThat(productRepository.findById(pelikanM805.getId()))
                  .get().isEqualTo(pelikanM805);

    }

    @Test
    public void cTestDelete() {
        assertThat(productRepository.findAll()).isEmpty();


    }

}
