package com.org.Scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp 
{
	public static void main(String[] args) 
	{
		//load spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach=context.getBean("tennisCoach",Coach.class);
		
		//check if they are same object or not
		boolean result=(theCoach==alphaCoach);
		
		//print out the result
		System.out.println("Is these two are pointing to the same object? : "+result);
		
		System.out.println("\nMemory location for theCoach: "+theCoach);
		System.out.println("\nMemory location for alphaCoach: "+alphaCoach);
		
		//close context
		context.close();

	}
}
