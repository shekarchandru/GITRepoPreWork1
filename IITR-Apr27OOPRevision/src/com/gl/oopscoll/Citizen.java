package com.gl.oopscoll;

public class Citizen {
	
	String citizenId;
	String citizenName;
	String citizenCity;
	int age;
	
	
	public Citizen() {
		super();
	}


	public Citizen(String citizenId, String citizenName, String citizenCity, int age) {
		super();
		this.citizenId = citizenId;
		this.citizenName = citizenName;
		this.citizenCity = citizenCity;
		this.age = age;
	}


	public String getCitizenId() {
		return citizenId;
	}


	public void setCitizenId(String citizenId) {
		this.citizenId = citizenId;
	}


	public String getCitizenName() {
		return citizenName;
	}


	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}


	public String getCitizenCity() {
		return citizenCity;
	}


	public void setCitizenCity(String citizenCity) {
		this.citizenCity = citizenCity;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Citizen [citizenId=" + citizenId + ", citizenName=" + citizenName + ", citizenCity=" + citizenCity
				+ ", age=" + age + "]";
	}
	
	

}
