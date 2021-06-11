package com.app.wesomma.repository;

import com.app.wesomma.models.GoalType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalTypeRepository extends JpaRepository<GoalType, Long> {
    GoalType findById(Integer id);
}
