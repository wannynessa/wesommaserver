package com.app.wesomma.repository;

import com.app.wesomma.models.Account;
import com.app.wesomma.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findById(Integer id);

    List<Account> findAllByPerson(Person person);

    void deleteById(Integer id);

    List<Account> getByPerson(Person person);
}
