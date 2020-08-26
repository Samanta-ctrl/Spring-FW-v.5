package com.org.DefiningSpringBeans;

public class SadForuneService implements FortuneService 
{
	@Override
	public String getFortune() 
	{
		return "SadFortuneService: Today is sad day";
	}
}
