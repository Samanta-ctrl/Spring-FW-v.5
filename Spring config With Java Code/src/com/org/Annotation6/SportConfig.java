package com.org.Annotation6;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//add @Configuration for Java Configuration (by default it is empty, there is no bean defined. so we have to 
@Configuration
@ComponentScan("com.org.Annotation6") //the package name for start scanning to find all the classes that have @Component annotation and register them into spring container
public class SportConfig 
{
	
}


//first step:-  add @Configuraion annotation 
//second step:- we also tell it to do the component scanning with the @ComponentScan annotation 