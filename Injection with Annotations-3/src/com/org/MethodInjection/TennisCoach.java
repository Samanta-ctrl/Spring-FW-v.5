//using explicit bean id:-

package com.org.MethodInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//add @Component Annotation in the class

@Component
public class TennisCoach implements Coach 
{
	private FortuneService fortuneService;
	
	//we can use @Autowire annotation only one class at a time
	
	
	  //define a default constructor for setter injection 
	  public TennisCoach() 
	  {
	  		System.out.println("TennisCoach: inside no-args constructor"); 
	  }
	  
//for setter injection we create @Autowired annotation
//instead of using setter method we can actually use any method
	  
	  @Autowired public void doSomeCrazyStuff(FortuneService fortuneService) 
	  {
		  System.out.println("TennisCoach: inside doSomeCrazyStuff() method");
		  this.fortuneService = fortuneService; 
	  }
	 
	
	@Override
	public String getDailyWorkout() 
	{		
		return "TennisCoach: Practice your backhand volly";
	}

	@Override
	public String getDailyFortune() 
	{
		return fortuneService.getFortune();
	}
}
 /* 	when spring scans this package it will find this class @Component, 
 	it will automatically register this bean with the spring container and 
	they will use the bean ID. */
