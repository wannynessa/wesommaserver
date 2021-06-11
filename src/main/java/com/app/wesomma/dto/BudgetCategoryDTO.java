package com.app.wesomma.dto;

import com.app.wesomma.models.Budget;
import com.app.wesomma.models.BudgetCategory;
import com.app.wesomma.models.Category;
import com.app.wesomma.util.GroupUtil;
import com.app.wesomma.util.PersonUtil;

import java.util.Date;

public class BudgetCategoryDTO implements Comparable<BudgetCategoryDTO> {

    public BudgetCategoryDTO(BudgetCategory budgetCategory) {
        this.id = budgetCategory.getId();
        this.expectedValue = budgetCategory.getExpectedValue();
        this.realizedValue = budgetCategory.getRealizedValue();
        this.category = budgetCategory.getCategory();

    }

    private Integer id;

    private Double expectedValue;

    private Double realizedValue;

    private Category category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getExpectedValue() {
        return expectedValue;
    }

    public void setExpectedValue(Double expectedValue) {
        this.expectedValue = expectedValue;
    }

    public int compareTo(BudgetCategoryDTO budgetDTO) {
        if (this.id != null && this.id > budgetDTO.getId()) {
            return -1;
        } if(this.id != null && this.id < budgetDTO.getId()) {
            return 1;
        }
        return 0;
    }

    public Double getRealizedValue() {
        return realizedValue;
    }

    public void setRealizedValue(Double realizedValue) {
        this.realizedValue = realizedValue;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
