package com.app.wesomma.repository;

import com.app.wesomma.models.Action;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActionRepository extends JpaRepository<Action, Long> {

    Action findById(Integer id);

}
