package com.app.wesomma.repository;

import com.app.wesomma.models.TypeBudget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeBudgetRepository extends JpaRepository<TypeBudget, Long> {
    TypeBudget findById(Integer id);
}
