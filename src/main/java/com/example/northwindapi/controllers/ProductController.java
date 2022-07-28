package com.example.northwindapi.controllers;

import com.example.northwindapi.entities.CategoryEntity;
import com.example.northwindapi.entities.ProductEntity;
import com.example.northwindapi.repositories.ProductEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductEntityRepository repo;

    @GetMapping("/product") // READ
    public List<ProductEntity> getAllProducts(){

        return repo.findAll();
    }
    @GetMapping("/product/by-id/{ProductID}")
    public ProductEntity getProductById(@PathVariable int ProductID){
        return repo.findById(ProductID).get();
    }

    @GetMapping("/products/by-cat/{CategoryID}")
    public List<ProductEntity> getAllByCategoryId(@PathVariable int CategoryID){
        return repo.findByCategoryID(CategoryID);
    }

    @GetMapping("/product/by-id/{ProductID}/stock")
    public int getAllStockByProductId(@PathVariable int ProductID){
        ProductEntity product = repo.findById(ProductID).get();
        return product.getUnitsInStock();
    }

    @GetMapping("/product/by-id/{ProductID}/category")
    public CategoryEntity getCategoryByProductId(@PathVariable int ProductID){
        ProductEntity product = repo.findById(ProductID).get();
        return product.getCategoryID();
    }

    @PostMapping("/product/new") // CREATE
    public ResponseEntity<String> createProduct(@RequestBody ProductEntity product) {
        if (repo.existsById(product.getId())) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN)
                    .body("User attempted to create a product which already exists");
        } else {
            repo.save(product);
            return ResponseEntity.status(HttpStatus.CREATED).body("");
        }
    }

    @PutMapping() // UPDATE
    public void updateProduct(@RequestBody ProductEntity product) {
        repo.save(product);
    }

    @DeleteMapping("/product/delete/{id}") // DELETE
    @ResponseStatus(value= HttpStatus.NO_CONTENT)
    public void deleteByProductId(@PathVariable int ProductID){
        ProductEntity product = repo.findById(ProductID).get();
        repo.delete(product);
    }

}
