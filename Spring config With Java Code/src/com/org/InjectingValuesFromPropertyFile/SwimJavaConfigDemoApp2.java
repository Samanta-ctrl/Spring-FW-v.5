//Main Application	

package com.org.InjectingValuesFromPropertyFile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp2
{
	public static void main(String[] args) 
	{
		//read the spring config with Java class
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrieve the bean from spring container from the bean method name defined in our config file.
		SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class); //using default bean id
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get dailyFortune
		System.out.println(theCoach.getDailyFortune());
		
		//calling our new swim coach methods.. which has property value injected
		System.out.println("Email: "+theCoach.getEmail());
		System.out.println("Team: "+theCoach.getTeam());
		
		//close the context
		context.close();
	}
}


//retrieve the bean from spring container from the bean method name defined in our config file.