package com.dev.openAPI.ResumeBuilder.model;

import org.springframework.context.annotation.Description;

@Description("Model used to hold data related to skills of user")
public class Skill {

	
	private String skill;
	private Integer level;
	
	public Skill() {
	}
	
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	
	
	
}
