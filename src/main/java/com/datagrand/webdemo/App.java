package com.datagrand.webdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ComponentScan
@EnableAutoConfiguration
@Import(SpingbootdemoApplication.class)
public class App {
	
	
    public static void main(String[] args) {
    	 	SpringApplication.run(App.class, args);
    }
}
