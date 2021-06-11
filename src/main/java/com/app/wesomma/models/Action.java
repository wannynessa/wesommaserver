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
@Table(name = "ACTION")
public class Action implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6929689234535915444L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String atividade;
	
	@ManyToOne()
	@JoinColumn(name = "person_id")
	private Person person;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAtividade() {
		return atividade;
	}

	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}

	public Person getPessoa() {
		return person;
	}

	public void setPessoa(Person person) {
		this.person = person;
	}

	
}
