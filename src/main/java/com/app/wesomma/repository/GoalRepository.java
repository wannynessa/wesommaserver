package com.app.wesomma.repository;

import com.app.wesomma.models.Family;
import com.app.wesomma.models.Goal;
import com.app.wesomma.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoalRepository extends JpaRepository<Goal, Long> {
    Goal findById(Integer id);

    void deleteById(Integer id);

    List<Goal> findAllByPerson(Person person);
}
