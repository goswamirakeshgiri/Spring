package com.rg.bean;

import org.springframework.beans.factory.annotation.Required;

public class Address {

	private String city;
	
	@Required
	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString()
	{
		return city;
	}
}
