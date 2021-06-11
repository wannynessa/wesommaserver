package com.app.wesomma.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.app.wesomma.dto.PersonDTO;
import com.app.wesomma.util.GroupUtil;

@Entity
@Table(name = "PERSON")
public class Person implements Serializable{

	public Person() {}

	public Person(Integer id) {
		this.id = id;
	}

	public Person(PersonDTO personDTO) {
		if(personDTO.getId() != null) {
			this.id = personDTO.getId();
		}
		this.name = personDTO.getName();
		this.lastName = personDTO.getLastName();
		this.profile = personDTO.getProfile();
		this.user = personDTO.getUser();
		if(personDTO.getGroupDTO() != null) {
			this.family = new Family(personDTO.getGroupDTO());
		}
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1755044446833998430L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;

	private String lastName;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne()
	@JoinColumn(name = "profile_id")
	private Profile profile;
	
	@OneToMany(mappedBy = "person")
	private List<Action> actions;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="family_id")
	private Family family;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	public Family getFamily() {
		return family;
	}

	public void setFamily(Family family) {
		this.family = family;
	}
}
