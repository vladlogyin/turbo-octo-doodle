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

    @GetMapping("/customer/by-id/{customerID}")
    public ResponseEntity<CustomerEntity> getCustomer(@PathVariable String customerID) {
        if(repo.existsById(customerID))
        {
            return ResponseEntity.status(HttpStatus.OK).body(repo.findById(customerID).get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
    @PostMapping("/customer")
    public ResponseEntity<String> newCustomer(@RequestBody CustomerEntity customer){
        if (repo.existsById(customer.getId())) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN)
                    .body("Customer already exists");
        } else {
            repo.save(customer);
            return ResponseEntity.status(HttpStatus.CREATED).body("");
        }
    }
    @PutMapping("/customer")
    public void updateCustomer(CustomerEntity customer) {
        repo.save(customer);
    }
    @DeleteMapping("/customer/by-id/{customerID}")
    public ResponseEntity<String> deleteCustomer(@PathVariable String customerID) {
        if (repo.existsById(customerID)) {
            repo.deleteById(customerID);
            return ResponseEntity.status(HttpStatus.OK).body("Customer successfully deleted");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Customer to be deleted does not exist when checked");
        }
    }
}
