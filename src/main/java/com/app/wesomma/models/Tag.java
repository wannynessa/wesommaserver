package com.app.wesomma.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TAG")
public class Tag implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3525861977971231240L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String description;
	
	@ManyToOne()
	@JoinColumn(name = "transaction_id")
	private Transaction transaction;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Transaction getTransacao() {
		return transaction;
	}

	public void setTransacao(Transaction transaction) {
		this.transaction = transaction;
	}
	
	

}
