package com.app.wesomma.dto;

public class ActionDTO implements Comparable<ActionDTO> {

    Integer id;
    String activity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int compareTo(ActionDTO actionDTO) {
        if (this.id != null && this.id > actionDTO.getId()) {
            return -1;
        } if(this.id != null && this.id < actionDTO.getId()) {
            return 1;
        }
        return 0;
    }
}
