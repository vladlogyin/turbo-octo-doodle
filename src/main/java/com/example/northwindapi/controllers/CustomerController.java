package com.example.northwindapi.controllers;

import com.example.northwindapi.entities.CustomerEntity;
import com.example.northwindapi.entities.EmployeeEntity;
import com.example.northwindapi.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository repo;

    @GetMapping("/customers")
    public List<CustomerEntity> getCustomers() {
        return repo.findAll();
    }

    @GetMapping("/customers/{id}")
    public CustomerEntity getCustomer(@PathVariable String id) {
        return repo.findById(id).orElseThrow(()->new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/customer")
    public ResponseEntity<String> newCustomer(@RequestBody CustomerEntity customer){
        if (repo.existsById(customer.getId())) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN)
                    .body("User attempted to create a product which already exists");
        } else {
            repo.save(customer);
            return ResponseEntity.status(HttpStatus.CREATED).body("");
        }
    }
    @PutMapping("/customer")
    public void updateCustomer(CustomerEntity customer) {
        repo.save(customer);
    }
    @DeleteMapping("/cuztomer/by-id/{customerID}")
    public ResponseEntity<String> deleteCustomer(@PathVariable String customerID) {
        if (repo.existsById(customerID)) {
            repo.deleteById(customerID);
            return ResponseEntity.status(HttpStatus.OK).body("Customer successfully deleted");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Customer to be deleted does not exist when checked");
        }
    }
}
