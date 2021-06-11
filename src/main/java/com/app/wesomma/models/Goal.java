package com.app.wesomma.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "GOAL")
public class Goal implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4871214567234233477L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToOne
	private GoalType goalType;
	
	private Double totalValue;
	
	private Double currentValue;
	
	private String description;
	
	@OneToMany
	private List<Transaction> transaction;

	@OneToOne
	private Person person;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public GoalType getGoalType() {
		return goalType;
	}

	public void setGoalType(GoalType goalType) {
		this.goalType = goalType;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public Double getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(Double currentValue) {
		this.currentValue = currentValue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Transaction> getTransacao() {
		return transaction;
	}

	public void setTransacao(List<Transaction> transaction) {
		this.transaction = transaction;
	}


	public Person getPerson() { return person; }

	public void setPerson(Person person) { this.person = person; }
}
