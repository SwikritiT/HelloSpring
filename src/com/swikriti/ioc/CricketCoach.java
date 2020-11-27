package com.swikriti.ioc;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	private FortuneService fortune;
	private String team;
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public CricketCoach() {
		
	}
	public String getDailyWorkout() {
		return "Do 150 cardio";}
	 public String getFortune() { 
	 return fortune.getFortune();}
	 
	
	 
	 public void setFortune(FortuneService fortune) {
			this.fortune=fortune;
		}
}
