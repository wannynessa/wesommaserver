package com.app.wesomma.repository;

import com.app.wesomma.models.AccountType;
import com.app.wesomma.models.Institution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstitutionRepository extends JpaRepository<Institution, Long> {
    Institution findById(Integer id);

    Institution findByDescription(String description);
}
