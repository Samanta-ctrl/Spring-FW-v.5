//using explicit bean id:-

package com.org.ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//add @Component Annotation in the class
@Component

public class TennisCoach implements Coach 
{
	private FortuneService fortuneService;
	
	//create a constructor for constructor injection  and
	//configure dependency injection with @Autowired annotation
	
	@Autowired  // after doing it, Spring will scan for a component that implements ForuneService (here it it will find HappyFortuneService) 
				//and then inject it here into our TennisCoach
	public TennisCoach(FortuneService theFortuneService)
	{
		this.fortuneService=theFortuneService;
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
	they will use the bean ID of thatSillyCoach. */
