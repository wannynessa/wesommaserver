package com.app.wesomma.repository;

import com.app.wesomma.models.Account;
import com.app.wesomma.models.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountTypeRepository extends JpaRepository<AccountType, Long> {
    AccountType findById(Integer id);

    AccountType findByDescription(String description);
}
