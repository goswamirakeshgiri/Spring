package com.rg.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("resource/spring.xml");
		Test t=(Test)context.getBean("t");
		t.print();

	}

}
