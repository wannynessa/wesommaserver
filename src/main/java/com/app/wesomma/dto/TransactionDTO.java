package com.app.wesomma.dto;

import com.app.wesomma.models.*;
import com.app.wesomma.util.AccountUtil;
import com.app.wesomma.util.GroupUtil;

import java.sql.Date;

public class TransactionDTO implements Comparable<TransactionDTO> {

    public  TransactionDTO(Transaction transaction) {
        this.id = transaction.getId();
        this.date = transaction.getDate();
        this.value = transaction.getValue();
        this.description = transaction.getDescription();
        this.realized = transaction.getRealized();
        this.reminder = transaction.getReminder();
        this.category = transaction.getCategory();
        this.account = AccountUtil.parse(transaction.getAccount());
        this.typeTransaction = transaction.getTypeTransaction();
        this.amountRepetitions = transaction.getAmountRepetitions();
    }

    private Integer id;

    private Date date;

    private Double value;

    private String description;

    private Boolean realized;

    private Boolean reminder;

    private Category category;

    private AccountDTO account;

    private TypeTransaction typeTransaction;

    private Integer amountRepetitions;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getRealized() { return realized; }

    public void setRealized(Boolean realized) {
        this.realized = realized;
    }

    public Boolean isReminder() {
        return reminder;
    }

    public void setReminder(Boolean reminder) {
        this.reminder = reminder;
    }

    public Category getCategory() { return category; }

    public void setCategory(Category category) {
        this.category = category;
    }

    public AccountDTO getAccount() { return account; }

    public void setAccount(AccountDTO account) {
        this.account = account;
    }

    public Integer getAmountRepetitions() {
        return amountRepetitions;
    }

    public void setAmountRepetitions(Integer amountRepetitions) { this.amountRepetitions = amountRepetitions; }

    public TypeTransaction getTypeTransaction() {
        return typeTransaction;
    }

    public void setTypeTransaction(TypeTransaction typeTransaction) {
        this.typeTransaction = typeTransaction;
    }

    public int compareTo(TransactionDTO transactionDTO) {
        if (this.id != null && this.id > transactionDTO.getId()) {
            return -1;
        } if(this.id != null && this.id < transactionDTO.getId()) {
            return 1;
        }
        return 0;
    }
}
