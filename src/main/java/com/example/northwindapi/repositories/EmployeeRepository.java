package com.example.northwindapi.repositories;

import com.example.northwindapi.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
    List<EmployeeEntity> findByTitle(String title);
}