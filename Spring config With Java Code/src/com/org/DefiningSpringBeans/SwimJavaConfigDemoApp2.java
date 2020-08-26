//Main Application	

package com.org.DefiningSpringBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp2
{
	public static void main(String[] args) 
	{
		//read the spring config with Java class
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrieve the bean from spring container from the bean method name defined in our config file.
		Coach theCoach=context.getBean("musicCoach",Coach.class); //using default bean id
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get dailyFortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}
}


//retrieve the bean from spring container from the bean method name defined in our config file.