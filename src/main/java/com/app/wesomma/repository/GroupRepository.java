package com.app.wesomma.repository;

import com.app.wesomma.models.Family;
import com.app.wesomma.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupRepository extends JpaRepository<Family, Long> {
    Family findById(Integer id);

    void deleteById(Integer id);

    List<Family> findAllByLeader(Person leader);

    List<Family> findAllById(Integer id);
}
