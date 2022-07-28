package com.example.northwindapi;

import com.example.northwindapi.entities.ProductEntity;
import com.example.northwindapi.repositories.ProductEntityRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ProductsApiTest {
    @Autowired
    private ProductEntityRepository productRepo;


    @Test
    @DisplayName("Check if category ID from product exists in category table")
    @GetMapping("/product/by-id/{ProductID}/category")
    public void getCategoryByProductId(@PathVariable int ProductID){
        ProductEntity product = productRepo.findById(ProductID).get();
        //return product.getCategoryID();
        // todo work this out
    }

    @Test
    @DisplayName("Check if all products in list have correct, identical, category ID")
    @GetMapping("/products/by-cat/{CategoryID}")
    public void getAllByCategoryId(@PathVariable int CategoryID){
        List<ProductEntity> products = productRepo.findByCategoryID(CategoryID);
        int valid = 0;
        for (int i = 0; i < products.size(); i++){
            if (!products.get(i).getCategoryID().equals(CategoryID)){
                valid ++;
            }
        }
        Assertions.assertEquals(0, valid);
    }

    @Test
    @DisplayName("Check if product is successfully deleted")
    @DeleteMapping("/product/delete/{id}")
    @ResponseStatus(value= HttpStatus.NO_CONTENT)
    public void deleteByProductId(@PathVariable int ProductID){
        ProductEntity product = productRepo.findById(ProductID).get();
        productRepo.delete(product);
        Assertions.assertTrue(productRepo.findById(ProductID).isEmpty());
    }

    @Test
    @DisplayName("Check if post method adds new entry if it does not already exist")
    @PostMapping("/product/new")
    public void createProduct(@RequestBody ProductEntity product) {
        boolean valid = false;
        if (productRepo.existsById(product.getId())) {
            valid = true;
        } else {
            productRepo.save(product);
        }
        if (!productRepo.findById(product.getId()).isEmpty()){
            valid = true;
        }
        Assertions.assertTrue(valid);
    }

    @Test
    @GetMapping("/product/by-id/{ProductID}/stock")
    public int getAllStockByProductId(@PathVariable int ProductID){
        ProductEntity product = productRepo.findById(ProductID).get();
        return product.getUnitsInStock();
    }



}
