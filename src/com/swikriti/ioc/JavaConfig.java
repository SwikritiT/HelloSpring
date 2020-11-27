package com.swikriti.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.swikriti.ioc")
@PropertySource("classpath:sports.properties")
public class JavaConfig {
	@Bean
	public FortuneService getFortuneService() {
		return new HappyFortune();
	}
	
	@Bean
	public Coach getCoach() {
		return new FootballCoach(getFortuneService());
		
	}

}
