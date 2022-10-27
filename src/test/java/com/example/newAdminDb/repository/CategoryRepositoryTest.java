package com.example.newAdminDb.repository;

import com.example.newAdminDb.NewAdminDbApplicationTests;
import com.example.newAdminDb.model.entity.Category;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class CategoryRepositoryTest extends NewAdminDbApplicationTests {
    @Autowired
    private CategoryRepository categoryRepository;
/*
    @Test
    public void create(){
        Category category = new Category();
        category.setType("test2");
        category.setTitle("STUDENT");
        category.setCreatedAt(LocalDateTime.now());
        category.setCreatedBy("냐옹이");

        categoryRepository.save(category);
    }

 */
}
