package com.app.wesomma.models;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TRANSACTION")
public class Transaction implements Serializable{
	private static final long serialVersionUID = -4529730462122651584L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Date date;
	
	private Double value;
	
	private String description;
	
	private Boolean realized;
	
	private Boolean reminder;
	
	@OneToOne
	private Category category;
	
	@OneToOne
	private Account account;

	@OneToOne
	private TypeTransaction typeTransaction;

	@OneToOne
	private TypeRepetition typeRepetition;
	
	private Integer amountRepetitions;
	
	@OneToMany(mappedBy = "transaction")
	private List<Tag> tags;

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

	public Boolean getRealized() {
		return realized;
	}

	public void setRealized(Boolean realized) {
		this.realized = realized;
	}

	public Boolean getReminder() {
		return reminder;
	}

	public void setReminder(Boolean reminder) {
		this.reminder = reminder;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public TypeTransaction getTypeTransaction() {
		return typeTransaction;
	}

	public void setTypeTransaction(TypeTransaction typeTransaction) {
		this.typeTransaction = typeTransaction;
	}

	public TypeRepetition getTypeRepetition() {
		return typeRepetition;
	}

	public void setTypeRepetition(TypeRepetition typeRepetition) {
		this.typeRepetition = typeRepetition;
	}

	public Integer getAmountRepetitions() {
		return amountRepetitions;
	}

	public void setAmountRepetitions(Integer amountRepetitions) {
		this.amountRepetitions = amountRepetitions;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	
}
