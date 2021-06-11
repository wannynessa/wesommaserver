package com.app.wesomma.repository;

import com.app.wesomma.models.Income;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<Income, Long> {
    Income findById(Integer id);
}
