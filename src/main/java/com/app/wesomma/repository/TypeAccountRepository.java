package com.app.wesomma.repository;

import com.app.wesomma.models.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeAccountRepository extends JpaRepository<AccountType, Long> {
    AccountType findById(Integer id);
}
