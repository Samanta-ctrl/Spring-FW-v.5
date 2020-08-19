//using default bean id:-

package com.org.MethodInjection;

import org.springframework.stereotype.Component;

//add @Component Annotation in the class

@Component //default bean id (i.e.;  musicCoach)
public class MusicCoach implements Coach
{
	private FortuneService fortuneService;
	
	//we can use @Autowire annotation only one class at a time
	
	/*
	 * //define a default constructor for setter injection public MusicCoach() {
	 * System.out.println("MusicCoach: inside no-args constructor"); }
	 * 
	 * //for setter injection we create @Autowired annotation
	 * 
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * System.out.println("MusicCoach: inside setFortuneService() method");
	 * this.fortuneService = fortuneService; }
	 */
		
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