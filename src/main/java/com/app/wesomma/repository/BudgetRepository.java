package com.app.wesomma.repository;

import com.app.wesomma.models.Budget;
import com.app.wesomma.models.Family;
import com.app.wesomma.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
    Budget findById(Integer id);

    List<Budget> open(boolean open);

    Budget findByFamily(Family family);

    List<Budget> findAllByPerson(Person person);

    List<Budget> findAllByFamily(Family family);
}
