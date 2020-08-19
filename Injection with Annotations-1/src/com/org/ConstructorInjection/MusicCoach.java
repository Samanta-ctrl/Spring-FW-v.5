//using default bean id:-

package com.org.ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//add @Component Annotation in the class

@Component //default bean id (i.e.;  musicCoach)
public class MusicCoach implements Coach
{
	private FortuneService fortuneService;
	
	//create a constructor for constructor injection  and
	//configure dependency injection with @Autowired annotation
	
	@Autowired  // after doing it, Spring will scan for a component that implements ForuneService (here it it will find HappyFortuneService) 
				//and then inject it here into our TennisCoach
	public MusicCoach(FortuneService theFortuneService)
	{
		this.fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout() 
	{		
		return "MusicCoach: Practice every 1hr in singing";
	}

	@Override
	public String getDailyFortune() 
	{
		return fortuneService.getFortune();
	}
}


//default bean id will be the same name as class name but first letter will be in lower case. i.e; musicCoach