package com.app.wesomma.dto;

import com.app.wesomma.models.Person;
import com.app.wesomma.models.IncomeType;

public class IncomeDTO implements Comparable<IncomeDTO> {

    private Integer id;

    private Double value;

    private Boolean fix;

    private IncomeType incomeType;

    private Person person;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Boolean getFix() {
        return fix;
    }

    public void setFix(Boolean fix) {
        this.fix = fix;
    }

    public IncomeType getTipoRenda() {
        return incomeType;
    }

    public void setTipoRenda(IncomeType incomeType) {
        this.incomeType = incomeType;
    }

    public Person getPessoa() {
        return person;
    }

    public void setPessoa(Person person) {
        this.person = person;
    }

    public int compareTo(IncomeDTO incomeDTO) {
        if (this.id != null && this.id > incomeDTO.getId()) {
            return -1;
        } if(this.id != null && this.id < incomeDTO.getId()) {
            return 1;
        }
        return 0;
    }
}
