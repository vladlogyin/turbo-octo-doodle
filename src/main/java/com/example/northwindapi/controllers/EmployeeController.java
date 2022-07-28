package com.example.northwindapi.controllers;

import com.example.northwindapi.entities.EmployeeEntity;
import com.example.northwindapi.entities.ProductEntity;
import com.example.northwindapi.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository repo;

    @GetMapping("/employees")
    public List<EmployeeEntity> getEmployees() {
        return repo.findAll();
    }

    @GetMapping("/employee/by-id/{id}")
    public EmployeeEntity getEmployee(@PathVariable int id) {
        return repo.findById(id).orElseThrow(()->new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/employees/by-title/{Title}")
    public List<EmployeeEntity> getEmployeesByTitle(@PathVariable String Title){
        return repo.findByEmployeeTitle(Title);
    }

    //in review
    @PostMapping("/employee")
    public ResponseEntity<String> createProduct(@RequestBody EmployeeEntity employee) {
        if (repo.existsById(employee.getId())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Employee already exists");
        } else {
            repo.save(employee);
            return ResponseEntity.status(HttpStatus.CREATED).body("New employee has successfully been created");
        }
    }
    @PutMapping("/employee")
    public void updateEmployee(EmployeeEntity employee) {
        repo.save(employee);
    }
    @DeleteMapping("employee/by-id/{employeeID}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int employeeID) {
        if (repo.existsById(employeeID)) {
            repo.deleteById(employeeID);
            return ResponseEntity.status(HttpStatus.OK).body("Employee successfully deleted");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee to be deleted does not exist when checked");
        }
    }
}