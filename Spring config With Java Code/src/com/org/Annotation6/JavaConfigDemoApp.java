//Main Application	

package com.org.Annotation6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp
{
	public static void main(String[] args) 
	{
		//read the spring config with Java class
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach theCoach=context.getBean("tennisCoach",Coach.class); //using default bean id
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get dailyFortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}
}
