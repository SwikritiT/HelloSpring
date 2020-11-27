package com.swikriti.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		FootballCoach coach = (FootballCoach)context.getBean("theCoach",FootballCoach.class);
		System.out.println(coach.getDailyWorkout());
		context.close();
		
	}

}
