
package com.org.DefiningSpringBeans;


public class TennisCoach implements Coach 
{
	private FortuneService fortuneService;
	
	//default constructor
	public TennisCoach(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() 
	{		
		return "TennisCoach: Dailyworkout--> Practice your backhand volly";
	}

	@Override
	public String getDailyFortune() 
	{
		return fortuneService.getFortune();
	}
}

//---------------------------------------------------------------------------------------------------------------------------

/* 	when spring scans this package it will find this class @Component, 
 	it will automatically register this bean with the spring container and 
	they will use the bean ID. */

/*
 	@Component: 
 		Indicates that an annotated class is a “component”. 
 	Such classes are considered as candidates for auto-detection when using annotation-based 
 	configuration and classpath scanning.
 	
 	--> @Component annotation marks the Java class as a bean or component 
 	so that the component-scanning mechanism of Spring can add it into the application context.
*/

/*
	@Autowired: 
		Spring @Autowired annotation is used for automatic injection of beans. 
	Spring @Qualifier annotation is used in conjunction with Autowired to avoid confusion when we have 
	two of more bean configured for same type. This would eliminate the use of XML configurations.
*/

/*
	@PreDestroy and @PostConstruct:
	 	These are alternative way for bean initMethod and destroyMethod. 
	It can be used when the bean class is defined by us.
*/

/*
	@Qualifier:
		There may be scenarios when you create more than one bean of the same type and want to wire 
		only one of them with a property. Control this using @Qualifier annotation along with the @Autowired annotation.
*/


/*
	We use @Qualifier along with @Autowired to provide the bean id or bean name we want to use in ambiguous situations.
*/


/*
	We use @Scope to define the scope of a @Component class or a @Bean definition.
 It can be either singleton, prototype, request, session, globalSession or some custom scope.
*/

