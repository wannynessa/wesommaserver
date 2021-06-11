package com.app.wesomma.repository;

import com.app.wesomma.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findById(Integer id);

    List<Category> findByType(String type);
}
