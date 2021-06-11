package com.app.wesomma.repository;

import com.app.wesomma.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
    Tag findById(Integer id);
}
