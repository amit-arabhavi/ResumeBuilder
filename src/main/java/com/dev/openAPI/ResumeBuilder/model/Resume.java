package com.dev.openAPI.ResumeBuilder.model;

import java.util.List;

public class Resume {

	private String name;
	private String email;
	private String phoneNumber;
	private String addressLine;
	private Integer zip;
	private String city;
	private String birthDate;
	private String gender;
	private String nationality;
	private String maritalStatus;
	private String title;
	private List<Experiance> worExperiance;
	private List<Education> educationalDetails;
	private List<String> hobby;
	private List<Skill> skills;
	private List<Language> languages;
	private String achivement;
	private List<Course> courses;
	
	 public Resume() {
	}
	 
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public Integer getZip() {
		return zip;
	}
	public void setZip(Integer zip) {
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Experiance> getWorExperiance() {
		return worExperiance;
	}

	public void setWorExperiance(List<Experiance> worExperiance) {
		this.worExperiance = worExperiance;
	}

	public List<Education> getEducationalDetails() {
		return educationalDetails;
	}

	public void setEducationalDetails(List<Education> educationalDetails) {
		this.educationalDetails = educationalDetails;
	}

	public List<String> getHobby() {
		return hobby;
	}

	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	public String getAchivement() {
		return achivement;
	}

	public void setAchivement(String achivement) {
		this.achivement = achivement;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	
}
