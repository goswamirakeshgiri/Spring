package com.rg.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataMapUtil {

	private static Map dataMap=new HashMap<String,String>();
	
	
	public static void create(String k, String v) {
		dataMap.put(k, v);	
	}

	public static boolean search(String k) {
		
		if(dataMap.containsKey(k))
		{
			return true;
		}
		return false;
	}
	
	
	public static String getValue(String k) {
		
		if(dataMap.containsKey(k))
		{
			return (String) dataMap.get(k);
		}
		else
		{
			System.out.println("Key not found");
		}
		return null;
	}

	public static void delete(String k) {
		if(dataMap.containsKey(k))
		{
			dataMap.remove(k);
		}
		else
		{
			System.out.println("Key not found");
		}
	}

	
	public static void update(String k, String v) {

		if(dataMap.containsKey(k))
		{
			dataMap.put(k,v);
		}
		else
		{
			System.out.println("Key not found");
		}

	}
	public static void getAll()
	{
		for (Object k :  dataMap.keySet())
		{
		    System.out.println(k + " = " + dataMap.get(k));
		}
	}

	public static Map getDataMap() {
		// TODO Auto-generated method stub
		return dataMap;
	}

}
