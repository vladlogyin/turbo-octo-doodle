package com.example.northwindapi.controllers;

import com.example.northwindapi.entities.CategoryEntity;
import com.example.northwindapi.repositories.CategoryEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryEntityRepository repo;

    @GetMapping("/category/by-id/{categoryID}")
    public ResponseEntity<CategoryEntity> getCategoryByID(@PathVariable int categoryID){
        var cEntity = repo.findById(categoryID);
        if(cEntity.isEmpty())
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(cEntity.get(),HttpStatus.OK);
    }
    @GetMapping("/category")
    public List<CategoryEntity> getAllCategories(){
        return repo.findAll();
    }
    @PostMapping("/category")
    public ResponseEntity<String> addCategory(@RequestBody CategoryEntity category){
        if(repo.existsById(category.getId()))
        {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("");
        }
        else
        {
            repo.save(category);
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body("");
        }
    }

    @PutMapping("/category")
    public void updateCategory(CategoryEntity category) {
        repo.save(category);
    }

    @DeleteMapping("/category/by-id/{categoryID}")
    public ResponseEntity<String> deleteCategory(@PathVariable int categoryID) {
        if(repo.existsById(categoryID)) {
            repo.deleteById(categoryID);
            return ResponseEntity.status(HttpStatus.OK)
                    .body("Category successfully deleted (CODE 200)");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Category to be deleted did not exists when checked (CODE 404)");
        }
    }
}
