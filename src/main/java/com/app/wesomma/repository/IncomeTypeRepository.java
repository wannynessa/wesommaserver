package com.app.wesomma.repository;

import com.app.wesomma.models.IncomeType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeTypeRepository extends JpaRepository<IncomeType, Long> {
    IncomeType findById(Integer id);
}
