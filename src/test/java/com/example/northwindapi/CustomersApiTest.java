package com.example.northwindapi;

import com.example.northwindapi.entities.ProductEntity;
import com.example.northwindapi.repositories.CustomerRepository;
import com.example.northwindapi.repositories.ProductEntityRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootTest
class CustomersApiTest {
    @Autowired
    private CustomerRepository customerRepo;

    @Test
    void contextLoads() {
    }


    @Test
    @DisplayName("Check if input ID == ID in record")
    @GetMapping("/customers/{id}")
    public void getCustomer(@PathVariable String id) {
        Assertions.assertEquals(id, customerRepo.findById(id).get().getId());
    }

    @Test
    @DisplayName("Check that the list of customers != 0")
    @GetMapping("/product")
    public void getAllProducts(){
        //List<ProductEntity> products = repo.findAll();
        Assertions.assertNotEquals(0, customerRepo.findAll().size());
    }


}
