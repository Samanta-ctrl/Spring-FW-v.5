package com.org.FieldInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp
{
	public static void main(String[] args) 
	{
		//read the spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//get the bean from the spring container
		//Coach theCoach=context.getBean("thatSillyCoach",Coach.class); //using explicit bean id
		
		Coach theCoach=context.getBean("musicCoach",Coach.class); //using default bean id
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get dailyFortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}
}
