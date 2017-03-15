package com.rg.test;

import org.junit.Test;

import com.rg.app.DataMapUtil;

import static org.junit.Assert.*;

import java.util.Map;

public class TestJunit {
	

   @Test
   public void testCreate() {
	   
	   String k="FOOD1";
	   String v="APPLE1";
	   DataMapUtil.create(k, v);
	   Map map=DataMapUtil.getDataMap();
	   assertTrue(map.get(k).toString().equals(v)); 
	 //  assertEquals("Test","Test");
  
   }
   
   @Test
   public void testUpdate() {
	   
	   String k="FOOD1";
	   String v="APPLE1";
	   String v2="banana";
	   DataMapUtil.create(k, v);
	   DataMapUtil.update(k, v2);
	   
	   Map map=DataMapUtil.getDataMap();
	   assertTrue(map.get(k).toString().equals(v2.toString())); 
   }
   
   
   @Test
   public void testDelete() {
	   
	   String k="FOOD1";
	  
	   DataMapUtil.delete(k);
	   Map map=DataMapUtil.getDataMap();
	   assertEquals(map.get(k),null); 
   }
   
   @Test
   public void testSearch() {
	   
	   String k="FOOD";
	   String v="APPLE";
	   DataMapUtil.create(k, v);
	   
	   boolean found=DataMapUtil.search(k);
	   Map map=DataMapUtil.getDataMap();
	   assertTrue((map.get(k)!=null) == found);
	   
   }
    
}