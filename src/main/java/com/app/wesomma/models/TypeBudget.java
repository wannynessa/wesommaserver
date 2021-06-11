package com.app.wesomma.models;

import javax.persistence.*;

@Entity
@Table(name = "TYPEBUDGET")
public class TypeBudget {

    public TypeBudget() {}
    public TypeBudget(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
}
