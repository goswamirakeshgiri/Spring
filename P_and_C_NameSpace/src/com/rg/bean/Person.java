
package com.rg.bean;
public class Person {
	String name;
	String emailID;
	int age;
	Address address;
	

	public void setAddress(Address address) {
		this.address = address;
	}

	public Person(String name, String emailID, int age,Address address) {
		super();
		this.name = name;
		this.emailID = emailID;
		this.age = age;
		this.address=address;
		
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString()
	{
		return "Name: "+name+" Age: "+age+" EmailID: "+emailID+"Address"+address;
	}

}
