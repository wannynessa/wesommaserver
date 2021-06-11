package com.app.wesomma.dto;

import com.app.wesomma.models.Person;

import java.util.Date;
import java.util.List;

public class MessageDTO implements Comparable<MessageDTO> {

    private Integer id;

    private Person sender;

    private List<Person> receivers;

    private String message;

    private boolean read;

    private Date shippingDate;

    private Date dateReading;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Person getSender() {
        return sender;
    }

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public List<Person> getReceivers() {
        return receivers;
    }

    public void setReceivers(List<Person> receivers) {
        this.receivers = receivers;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public Date getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Date shippingDate) {
        this.shippingDate = shippingDate;
    }

    public Date getDateReading() {
        return dateReading;
    }

    public void setDateReading(Date dateReading) {
        this.dateReading = dateReading;
    }

    public int compareTo(MessageDTO messageDTO) {
        if (this.id != null && this.id > messageDTO.getId()) {
            return -1;
        } if(this.id != null && this.id < messageDTO.getId()) {
            return 1;
        }
        return 0;
    }
}
