package com.rg.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Client {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("resource/spring.xml");
		Person p=(Person)context.getBean("person");
		System.out.println(p);

	}
	public Client()
	{
		
	}

	
}
