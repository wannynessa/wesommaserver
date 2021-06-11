package com.app.wesomma.dto;

public class InstitutionDTO implements Comparable<InstitutionDTO> {

    private Integer id;

    private String description;

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

    public int compareTo(InstitutionDTO institutionDTO) {
        if (this.id != null && this.id > institutionDTO.getId()) {
            return -1;
        } if(this.id != null && this.id < institutionDTO.getId()) {
            return 1;
        }
        return 0;
    }
}
