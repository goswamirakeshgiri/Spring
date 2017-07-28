package com.rg.spring.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
 
@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "fname", nullable = false)
	String fname;
	
	@Column(name = "lname", nullable = false)
	String lname;
	
	@Column(name = "cellno", nullable = false)
	String cellno;
	
	@Column(name = "age", nullable = false)
	int age;
	
	@Column(name = "emailid", nullable = false)
	String emailID;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCellno() {
		return cellno;
	}
	public void setCellno(String cellno) {
		this.cellno = cellno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	 @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + id;
	        return result;
	    }
	 
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (!(obj instanceof User))
	            return false;
	        User other = (User) obj;
	        if (id != other.id)
	            return false;
	       
	        return true;
	    }
	    
	    @Override
	    public String toString() {
	        return "User [id=" + id + ", name=" + fname + ", Age="
	                + age+"]";
	    }
	     

}
