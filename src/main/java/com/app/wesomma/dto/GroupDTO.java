package com.app.wesomma.dto;

import com.app.wesomma.models.Family;
import com.app.wesomma.util.PersonUtil;
import java.util.List;

public class GroupDTO implements Comparable<GroupDTO> {
    public GroupDTO() {}

    public GroupDTO(Family family, boolean createPerson) {
        this.createPerson = createPerson;
            this.id = family.getId();
        this.name = family.getName();
        this.people = PersonUtil.parseList(family.getPeople(), false);
        this.leader = PersonUtil.parse(family.getLeader(), false);
    }

    private Integer id;

    private String name;

    private List<PersonDTO> people;

    private PersonDTO leader;

    private boolean createPerson;

    public List<PersonDTO> getPeople() {
        return people;
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

    public void setPeople(List<PersonDTO> people) {
        this.people = people;
    }

    public PersonDTO getLeader() {
        return leader;
    }

    public void setLeader(PersonDTO leader) {
        this.leader = leader;
    }

    public boolean isCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(boolean createPerson) {
        this.createPerson = createPerson;
    }

    public int compareTo(GroupDTO groupDTO) {
        if (this.id != null && this.id > groupDTO.getId()) {
            return -1;
        } if(this.id != null && this.id < groupDTO.getId()) {
            return 1;
        }
        return 0;
    }
}
