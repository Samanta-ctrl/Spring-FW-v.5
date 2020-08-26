
package com.org.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//add @Component Annotation in the class

@Component
@Scope("singleton") //by default scope will be singleton (in prototype scope, its going to create a new instance every time)
public class TennisCoach implements Coach 
{
	private FortuneService fortuneService;
	
	//default constructor
	public TennisCoach()
	{
		System.out.println("TennisCoach: inside defsult constructor");
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
	
	//define my init method
	
	@PostConstruct //code will execute after constructor and after injection of dependencies
	public void doMyStartupStuff()
	{
		System.out.println(">> TennisCoach: inside of doMyStartupStuff method");
	}
	
	
	//define my destroy method
	
	@PreDestroy  //code will execute before  bean is destroyed
	public void doMyCleanupStuff()
	{
		System.out.println(">> TennisCoach: inside of doMyCleanupStuff method");
	}
}
 
/* 	when spring scans this package it will find this class @Component, 
 	it will automatically register this bean with the spring container and 
	they will use the bean ID. */
