package com.swikriti.ioc;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringApp {
	public static void main (String [] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach= (Coach)context.getBean("theCricCoach",Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		System.out.println(((CricketCoach) coach).getTeam());
		
	}

}
