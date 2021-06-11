package com.app.wesomma.repository;

import com.app.wesomma.models.TypeRepetition;
import com.app.wesomma.models.TypeTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepetitionRepository extends JpaRepository<TypeRepetition, Long> {
    TypeRepetition findById(Integer id);
}
