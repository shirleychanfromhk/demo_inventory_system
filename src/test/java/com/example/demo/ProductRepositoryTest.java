package com.example.demo;


import java.math.BigDecimal;
import java.util.logging.Logger;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testSave() throws Exception {
    	System.out.println("Start JUnit");
        Product pen= new Product();
   
        pen.setProductId("001");
        pen.setProductName("Pen");
        pen.setPrice(new BigDecimal("10.0"));
        pen.setQuantity(10);
        pen.setLocation("TKO");
        pen.setWeight(50);
   
        productRepository.save(pen);
        Iterable<Product> resultList = productRepository.findAll();
        System.out.println(resultList.toString());
        
        System.out.println("Saved product - productId: " + pen.getProductId());
    }

}
