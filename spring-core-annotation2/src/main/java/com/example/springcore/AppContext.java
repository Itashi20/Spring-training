package com.example.springcore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("com")

//we can also import xml suppose we have legacy code 200 classs now we cannot convert to annotations 
//every cllass so we simply import that xml file -->Reason
@ImportResource(value=" ")
public class AppContext {

}
