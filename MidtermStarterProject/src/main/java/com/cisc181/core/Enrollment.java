package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	// Private attributes
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	// Getters and setters
	public UUID getSectionID() {
		return SectionID;
	}
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	public UUID getStudentID() {
		return StudentID;
	}
	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}
	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}
	public double getGrade() {
		return Grade;
	}
	public void setGrade(double grade) {
		Grade = grade;
	}
	
	// Private no-arg constructor 
	private Enrollment(){}
	
	// Constructor with parameters StudentID and SectionID
	public Enrollment(UUID StudentID, UUID SectionID){
		this.setStudentID(StudentID);
		this.setSectionID(SectionID);
		/** Set EnrollmentID in the constructor
		 * UUID.randomUUID() is used to create a unique ID number
		 */
		this.setEnrollmentID(UUID.randomUUID());
	}
	
}
