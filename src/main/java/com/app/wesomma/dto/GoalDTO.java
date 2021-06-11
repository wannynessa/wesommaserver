package com.app.wesomma.dto;

import com.app.wesomma.models.Goal;
import com.app.wesomma.models.GoalType;
import com.app.wesomma.util.PersonUtil;

public class GoalDTO implements Comparable<GoalDTO> {

    public GoalDTO(Goal goal) {
        this.id = goal.getId();
        this.goalType = goal.getGoalType();
        this.totalValue = goal.getTotalValue();
        this.currentValue = goal.getCurrentValue();
        this.description= goal.getDescription();
        this.person = PersonUtil.parse(goal.getPerson(), false);
    }

    private Integer id;

    private GoalType goalType;

    private Double totalValue;

    private Double currentValue;

    private String description;

    private PersonDTO person;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GoalType getGoalType() {
        return goalType;
    }

    public void setGoalType(GoalType goalType) {
        this.goalType = goalType;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public Double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PersonDTO getPerson() {
        return person;
    }

    public void setPerson(PersonDTO person) {
        this.person = person;
    }

    public int compareTo(GoalDTO goalDTO) {
        if (this.id != null && this.id > goalDTO.getId()) {
            return -1;
        } if(this.id != null && this.id < goalDTO.getId()) {
            return 1;
        }
        return 0;
    }
}
