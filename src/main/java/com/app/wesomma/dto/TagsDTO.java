package com.app.wesomma.dto;

public class TagsDTO implements Comparable<TagsDTO> {

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

    public int compareTo(TagsDTO tagsDTO) {
        if (this.id != null && this.id > tagsDTO.getId()) {
            return -1;
        } if(this.id != null && this.id < tagsDTO.getId()) {
            return 1;
        }
        return 0;
    }
}
