package com.app.wesomma.repository;

import com.app.wesomma.models.Family;
import com.app.wesomma.models.Person;
import com.app.wesomma.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findById(Integer id);

    void deleteById(Integer id);

    Person findByUser(User user);

    List<Person> findByFamily(Family family);

}
