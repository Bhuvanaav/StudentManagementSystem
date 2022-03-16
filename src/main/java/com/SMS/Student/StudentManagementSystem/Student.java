package com.SMS.Student.StudentManagementSystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
    @GeneratedValue
    private int id;
	private int rollNo;
	private String firstName;
	private String lastName;
	private int standard;
	private String Division;
	private String schoolName;
	private String phoneNumber;
	private String gender;
	private boolean status;
	
	
	
	public Student() {
		super();
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public String getDivision() {
		return Division;
	}
	public void setDivision(String division) {
		Division = division;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public boolean isStatus() {
		return status;
	}
	public boolean setStatus(boolean status) {
		this.status = status;
		return status;
	
	}
	

	public Student(int id, int rollNo, String firstName, String lastName, int standard, String division,
			String schoolName, String phoneNumber, String gender, boolean status) {
		super();
		this.id = id;
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.standard = standard;
		Division = division;
		this.schoolName = schoolName;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.status = status;
		
	}
	
	
	

}
