package com.org.DefiningSpringBeans;

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
