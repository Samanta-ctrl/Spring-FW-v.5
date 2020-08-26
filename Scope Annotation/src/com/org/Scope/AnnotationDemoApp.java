//Main Application	

package com.org.Scope;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp
{
	public static void main(String[] args) 
	{
		//read the spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//to show how much bean is created by the spring container
		Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		//get the bean from the spring container
		//Coach theCoach=context.getBean("thatSillyCoach",Coach.class); //using explicit bean id
		
		Coach theCoach=context.getBean("tennisCoach",Coach.class); //using default bean id
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get dailyFortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}
}
