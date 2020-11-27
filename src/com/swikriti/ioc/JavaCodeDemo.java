package com.swikriti.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaCodeDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Coach coach= (Coach)context.getBean("theCoach",Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		System.out.println(((FootballCoach) coach).getTeam());
		context.close();

	}

}
