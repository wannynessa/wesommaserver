package com.app.wesomma.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "MESSAGE")
public class Message implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2863340872365608144L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String message;

	private Boolean readit;

	private Date shippingDate;

	private Date dateReading;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean getReadit() {
		return readit;
	}

	public void setReadit(boolean readit) {
		this.readit = readit;
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
	

	
}
