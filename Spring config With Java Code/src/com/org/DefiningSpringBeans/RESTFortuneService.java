package com.org.DefiningSpringBeans;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService
{
	@Override
	public String getFortune() 
	{
		return null;
	}
}
