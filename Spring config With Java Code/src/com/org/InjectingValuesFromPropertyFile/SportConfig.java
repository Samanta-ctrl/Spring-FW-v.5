package com.org.InjectingValuesFromPropertyFile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//add @Configuration for Java Configuration (by default it is empty, there is no bean defined. so we have to 
@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig 
{
	//define a method to expose bean for sad fortune service
	@Bean
	public FortuneService sadFortuneService() //this method name is the bean ID
	{
		return new SadForuneService();
	}
	
	//define bean for our swim coach and inject dependency
	
	@Bean //creating bean for SwimCoach class
	public Coach swimCoach()
	{
		return new SwimCoach(sadFortuneService()); // here we inject dependency  
		//we calling bean method and then it'll give us a ref. to the actual bean based on the bean scope	
	}
	
	@Bean  //creating bean for TennisCoach class
	public Coach tennisCoach()
	{
		return new TennisCoach(sadFortuneService()); // here we inject dependency  
		//we calling bean method and then it'll give us a ref. to the actual bean based on the bean scope	
	}
	
	@Bean  //creating bean for MusicCoach class
	public Coach musicCoach()
	{
		return new MusicCoach(sadFortuneService()); // here we inject dependency  
		//we calling bean method and then it'll give us a ref. to the actual bean based on the bean scope	
	}
}




//1st step:- add @Configuraion annotation 
//2nd step:- we also tell it to do the component scanning with the @ComponentScan annotation 
//3rd step:- define a method to expose bean for sad fortune service (add @Bean annotation)
//4th Step:- define bean for our swim coach and inject dependency
