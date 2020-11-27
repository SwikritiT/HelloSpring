package com.swikriti.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("singleton")
public class FootballCoach implements Coach {
	@Autowired
	@Qualifier("getFortuneService")
	private FortuneService fortune;
	@Value("${footballTeam}")
	private String team;
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public FootballCoach(FortuneService fortune) {
		this.fortune=fortune;
	}
	public String getDailyWorkout() {
		return "Do 150 cardio";}
	 public String getFortune() {return fortune.getFortune();}
	 
	 
	 public void initialize() {
		 System.out.println("Starting bean....");
	 }
	 
	 public void doCleanUp() {
		 System.out.println("cleaning up...");
	 }
}
