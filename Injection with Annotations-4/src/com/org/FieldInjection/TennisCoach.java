//using explicit bean id:-

package com.org.FieldInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//add @Component Annotation in the class

@Component
public class TennisCoach implements Coach 
{
	//field injection with @Autowired annotation
	
	@Autowired
	private FortuneService fortuneService;
	
	/*  spring will construct the class by calling default constructor and then it will inject a fortuneService
	implementation  directly into this class with the help of some Java technology called 'Reflection' .  
	You don't need any constructor injection or setter injection. simply make use of this field injection   */
	
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
