package com.org.DefiningSpringBeans;

public class SwimCoach implements Coach 
{
	//define a private field for constructor
	private FortuneService fortuneService;
	
	//define constructor for injection
	public SwimCoach(FortuneService fortuneService) 
	{
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() 
	{
		return "Swim 1000 meters as a warm up..";
	}

	@Override
	public String getDailyFortune() 
	{
		return fortuneService.getFortune();
	}
	
}
