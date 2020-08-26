//using default bean id:-

package com.org.Scope;

import org.springframework.stereotype.Component;

//add @Component Annotation in the class

@Component //default bean id (i.e.;  musicCoach)
public class MusicCoach implements Coach
{
	//field injection with @Autowired annotation
	
	private FortuneService fortuneService;
	
	/*  spring will construct the class by calling default constructor and then it will inject a fortuneService
	implementation  directly into this class with the help of some Java technology called 'Reflection' .  
	You don't need any constructor injection or setter injection. simply make use of this field injection   */
	
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