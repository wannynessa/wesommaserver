package com.app.wesomma.models;

import com.app.wesomma.dto.GroupDTO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "FAMILY")
public class Family implements Serializable{

	private static final long serialVersionUID = 5631514633453210313L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;

	@OneToOne
	private Person leader;

	@OneToMany(cascade={CascadeType.ALL},mappedBy = "family")
	private List<Person> people;


	public Family() {}

	public Family(Integer id) {
		this.id = id;
	}

	public Family (Integer id, String name, Person leader, List<Person> people) {
		this.id = id;
		this.name = name;
		this.leader = leader;
		this.people = people;
	}

	public Family(GroupDTO groupDTO) {
		if(groupDTO.getId() != null) {
			this.id = groupDTO.getId();
		}
		this.name = groupDTO.getName();
		this.leader = new Person(groupDTO.getLeader());
	}

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

	public List<Person> getPeople(){ return people;}

	public void setPeople(List<Person> people) {this.people = people;}

	public Person getLeader() { return leader;}

	public void setLeader(Person leader) {this.leader = leader;}

}
