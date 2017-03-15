package com.rg.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("resource/spring.xml");
		Car c1=(Car)context.getBean("car");
		System.out.println(c1);

	}

}
