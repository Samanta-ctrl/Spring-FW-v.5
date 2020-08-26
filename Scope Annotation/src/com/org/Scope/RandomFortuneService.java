package com.org.Scope;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService 
{
	//create an array of string
	private String[] data= {"Beware of wolf",
						    "Deligence is the mother of good luck",
						    "The journey is reward"
						   };
	
	//create a random number generator
	private Random myRandom=new Random();
	
	
	@Override
	public String getFortune() 
	{
		//pick a random string from the array(Random Number implementation)
		int index=myRandom.nextInt(data.length); //--> get random number based of size of array	
		String theFortune=data[index]; //--> grab a random fortune from the array
		return theFortune;
	}
}
