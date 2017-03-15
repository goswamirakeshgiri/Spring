package com.rg.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test {

	private Properties drivers;
	
	public Properties getDrivers() {
		return drivers;
	}

	public void setDrivers(Properties drivers) {
		this.drivers = drivers;
	}

	public void print()
	{
		for(Object key:drivers.keySet())
		{
			System.out.println(key+"="+drivers.getProperty(key.toString()));
		}
	}
	
	
}
