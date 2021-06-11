package com.app.wesomma.dto;

import com.app.wesomma.models.Account;
import com.app.wesomma.models.AccountType;
import com.app.wesomma.models.Institution;
import com.app.wesomma.util.PersonUtil;

public class AccountDTO implements Comparable<AccountDTO> {
    private Integer id;

    private String name;

    private String agency;

    private String number;

    private Institution institution;

    private AccountType accountType;

    private Double balance;

    public PersonDTO getPerson() {
        return person;
    }

    public void setPerson(PersonDTO person) {
        this.person = person;
    }

    private PersonDTO person;

    public AccountDTO(Account account) {
        this.id = account.getId();
        this.name = account.getName();
        this.agency = account.getAgency();
        this.number = account.getNumber();
        this.institution = account.getInstitution();
        this.balance = account.getBalance();
        if(account.getPerson() != null) {
            this.person = PersonUtil.parse(account.getPerson(), false);
        }
        this.accountType = account.getAccountType();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() { return  name; }

    public void setName(String name) { this.name = name; }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Institution getInstitution() { return institution; }

    public void setInstitution(Institution institution) { this.institution = institution; }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public int compareTo(AccountDTO accountDTO) {
        if (this.balance != null && this.balance > accountDTO.getBalance()) {
            return -1;
        } if(this.balance != null && this.balance < accountDTO.getBalance()) {
            return 1;
        }
        return 0;
    }
}
