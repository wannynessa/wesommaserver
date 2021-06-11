package com.app.wesomma.dto;

import com.app.wesomma.models.Profile;

public class UserDTO implements Comparable<UserDTO> {

    private Integer id;

    private String email;

    private String password;

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

    public int compareTo(UserDTO userDTO) {
        if (this.id != null && this.id > userDTO.getId()) {
            return -1;
        } if(this.id != null && this.id < userDTO.getId()) {
            return 1;
        }
        return 0;
    }
}
