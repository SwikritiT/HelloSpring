package com.swikriti.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		FootballCoach coach1 = context.getBean("theCoach",FootballCoach.class);
		FootballCoach coach2 =context.getBean("theCoach",FootballCoach.class);
		System.out.println(coach1);
		System.out.println(coach2);
		context.close();

	}

}
