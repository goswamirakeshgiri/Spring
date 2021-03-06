package com.rg.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public List<String> fruits=new ArrayList<String>();
	public Set<String> cricketers=new HashSet<String>();
	public Map<String,String> country=new HashMap<>();

	public void setFruits(List<String> fruits) {
		this.fruits = fruits;
	}

	public void setCricketers(Set<String> cricketers) {
		this.cricketers = cricketers;
	}

	public void setCountry(Map<String, String> country) {
		this.country = country;
	}

	public List getFruits() {
		return fruits;
	}

	
	public void print()
	{
		System.out.println("Fruit list-->"+"\n");
		for(String s:fruits)
		{
			System.out.println(s+"\n");
		}
		System.out.println("Printing cricketers-->"+"\n");
		for(String s:cricketers)
		{
			System.out.println(s+"\n");
		}
		
		System.out.println("Printing country-->"+"\n");
		for(String s:country.keySet())
		{
			System.out.println("Country:"+s+"Capital: "+country.get(s)+"\n");
		}
	}
	
	
}
