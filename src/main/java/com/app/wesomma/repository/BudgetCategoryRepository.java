package com.app.wesomma.repository;


import com.app.wesomma.models.Budget;
import com.app.wesomma.models.BudgetCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BudgetCategoryRepository extends JpaRepository<BudgetCategory, Long> {
    BudgetCategory findById(Integer id);

    List<BudgetCategory> findByBudget(Budget budget);
}
