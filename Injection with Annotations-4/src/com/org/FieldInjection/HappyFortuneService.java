package com.org.FieldInjection;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService 
{
	@Override
	public String getFortune() 
	{	
		return "HappyForune: Good Luck!";  //handled by dependency
	}
}
