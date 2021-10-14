package com.dev.openAPI.ResumeBuilder.model;

import org.springframework.context.annotation.Description;

@Description("Model to hold work experiance retaed data")
public class Experiance {

	private String jobTitle;
	private String employer;
	private String workLoc;
	private String startDate;
	private boolean isPresentEmplyer;
	private String endDate;
	private String workDesc;
	private String duration;
	
	public Experiance() {
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public String getWorkLoc() {
		return workLoc;
	}
	public void setWorkLoc(String workLoc) {
		this.workLoc = workLoc;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public boolean isPresentEmplyer() {
		return isPresentEmplyer;
	}
	public void setPresentEmplyer(boolean isPresentEmplyer) {
		this.isPresentEmplyer = isPresentEmplyer;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getWorkDesc() {
		return workDesc;
	}
	public void setWorkDesc(String workDesc) {
		this.workDesc = workDesc;
	}
	
	
	
}
