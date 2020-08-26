//Main Application	

package com.org.Annotation6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp
{
	public static void main(String[] args) 
	{
		//read the spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach=context.getBean("tennisCoach",Coach.class); //using default bean id
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get dailyFortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}
}
