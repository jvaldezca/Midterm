package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	
	// Private Attributes
	private UUID CourseID;
	private String CourseName;
	private int Gradepoints;
	private eMajor Major; 
	
	// Getters and Setters
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getGradepoints() {
		return Gradepoints;
	}
	public void setGradepoints(int gradepoints) {
		Gradepoints = gradepoints;
	}
	public eMajor getMajor() {
		return Major;
	}
	public void setMajor(eMajor major) {
		Major = major;
	}
	

}
