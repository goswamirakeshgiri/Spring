package com.rg.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
	public static void main(String args[])
	{
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("/resource/spring.xml");
		 Test t1=(Test) context.getBean("helloWorld");
		 Test t2=(Test)context.getBean("helloWorld");
			Test t3=(Test)context.getBean("helloWorld");
				 
		/*Resource r=new ClassPathResource("/resource/spring.xml");
		BeanFactory factory=new XmlBeanFactory(r);*/
	/*	Test t1=(Test)factory.getBean("helloWorld");
	
		Test t2=(Test)factory.getBean("helloWorld");
		Test t3=(Test)factory.getBean("helloWorld");
		t1.Hello();
		t2.Hello();
		t3.Hello();
		
		
		System.out.println(t1==t2);
		System.out.println(t3==t2);
	*/	
	}

}
