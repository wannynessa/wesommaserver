package com.app.wesomma.repository;

import com.app.wesomma.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenssageRepository extends JpaRepository<Message, Long> {
    Message findById(Integer id);
}
