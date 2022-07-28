package com.example.northwindapi.repositories;

import com.example.northwindapi.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductEntityRepository extends JpaRepository<ProductEntity, Integer> {
    List<ProductEntity> findByCategoryID(int categoryID);
}