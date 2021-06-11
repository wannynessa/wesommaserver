package com.app.wesomma.dto;

import com.app.wesomma.models.Profile;
import com.app.wesomma.models.Person;
import com.app.wesomma.models.User;
import com.app.wesomma.util.GroupUtil;


public class PersonDTO implements Comparable<PersonDTO> {

    public PersonDTO() {}

    public  PersonDTO(Person person, boolean createFamily) {
        this.id = person.getId();
        this.name = person.getName();
        this.lastName = person.getLastName();
        this.profile = person.getProfile();
        this.user = person.getUser();
        if(createFamily == true) {
            this.groupDTO = GroupUtil.parseFamilyToGroupDTO(person.getFamily());
        }
    }

    private Integer id;

    private String name;

    private String lastName;

    private Profile profile;

    private User user;

    private GroupDTO groupDTO;

    private boolean createFamily;

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

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user;}

    public GroupDTO getGroupDTO() { return groupDTO; }

    public void setGroupDTO(GroupDTO groupDTO) { this.groupDTO = groupDTO; }

    public boolean isCreateFamily() {
        return createFamily;
    }

    public void setCreateFamily(boolean createFamily) {
        this.createFamily = createFamily;
    }

    public int compareTo(PersonDTO personDTO) {
        if (this.id != null && this.id > personDTO.getId()) {
            return -1;
        } if(this.id != null && this.id < personDTO.getId()) {
            return 1;
        }
        return 0;
    }
}
