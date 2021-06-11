package com.app.wesomma.repository;

import com.app.wesomma.models.Account;
import com.app.wesomma.models.Person;
import com.app.wesomma.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    Transaction findById(Integer id);

    void deleteById(Integer id);

    List<Transaction> findByAccount(Account account);
}
