package com.org.InjectingValuesFromPropertyFile;

import org.springframework.beans.factory.annotation.Value;

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
	
	//define fields for injection
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	

	public String getEmail() 
	{
		return email;
	}

	public String getTeam() 
	{
		return team;
	}
}
