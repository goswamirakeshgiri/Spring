package com.rg.bean;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	private Engine engine;
	
	
	/*private Car(Engine e1)
	{
		this.e1=e1;
	}*/

	/*public Engine getE1() {
		return e1;
	}

	public void setE1(Engine e1) {
		this.e1 = e1;
	}
*/
	@Override
	public String toString() {
		return "Car [engine=" + engine + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
	
	
}
