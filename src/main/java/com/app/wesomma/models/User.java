package com.app.wesomma.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="USER")
public class User implements Serializable{

	public User(){}
	/**
	 * 
	 */
	private static final long serialVersionUID = -8813502483479603816L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String email;
	
	private String password;
	
	@OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.PERSIST)
	private Profile profile;
	
	private Boolean active;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Profile getPerfil() {
		return profile;
	}

	public void setPerfil(Profile profile) {
		this.profile = profile;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
}
