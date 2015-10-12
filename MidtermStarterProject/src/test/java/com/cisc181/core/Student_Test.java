package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Create an array for course
		ArrayList<Course> myCourse = new ArrayList<Course>();
		// Create 3 instances for course
		Course record1 = new Course();
		record1.setCourseName("MATH243");
		record1.setCourseID(UUID.randomUUID());
		Course record2 = new Course();
		record2.setCourseName("CISC181");
		record2.setCourseID(UUID.randomUUID());
		Course record3 = new Course();
		record3.setCourseName("PHYS207");
		record3.setCourseID(UUID.randomUUID());
		// Add them to the array
		myCourse.add(record1);
		myCourse.add(record2);
		myCourse.add(record3);
		// Create an array for semester
		ArrayList<Semester> mySemester = new ArrayList<Semester>();
		// Create 2 instances of semester
		Semester fall = new Semester();
		fall.setSemesterID(UUID.randomUUID());
		Semester spring = new Semester();
		spring.setSemesterID(UUID.randomUUID());
		// Add them to the array
		mySemester.add(fall);
		mySemester.add(spring);
		// Create an array for sections
		ArrayList<Section> mySection = new ArrayList<Section>();
		// Create 2 sections for each course
		Section fallrecord1 = new Section();
		fallrecord1.setCourseID(record1.getCourseID());
		fallrecord1.setSemesterID(fall.getSemesterID());
		fallrecord1.setSectionID(UUID.randomUUID());
		fallrecord1.setRoomID(100);
		Section fallrecord2 = new Section();
		fallrecord2.setCourseID(record2.getCourseID());
		fallrecord2.setSemesterID(fall.getSemesterID());
		fallrecord2.setSectionID(UUID.randomUUID());
		fallrecord2.setRoomID(200);
		Section fallrecord3 = new Section();
		fallrecord3.setCourseID(record3.getCourseID());
		fallrecord3.setSemesterID(fall.getSemesterID());
		fallrecord3.setSectionID(UUID.randomUUID());
		fallrecord3.setRoomID(300);
		Section springrecord1 = new Section();
		springrecord1.setCourseID(record1.getCourseID());
		springrecord1.setSemesterID(spring.getSemesterID());
		springrecord1.setSectionID(UUID.randomUUID());
		springrecord1.setRoomID(101);
		Section springrecord2 = new Section();
		springrecord2.setCourseID(record2.getCourseID());
		springrecord2.setSemesterID(spring.getSemesterID());
		springrecord2.setSectionID(UUID.randomUUID());
		springrecord2.setRoomID(202);
		Section springrecord3 = new Section();
		springrecord3.setCourseID(record3.getCourseID());
		springrecord3.setSemesterID(spring.getSemesterID());
		springrecord3.setSectionID(UUID.randomUUID());
		springrecord3.setRoomID(303);
		// Add them to the array
		mySection.add(fallrecord1);
		mySection.add(fallrecord1);
		mySection.add(fallrecord1);
		mySection.add(springrecord1);
		mySection.add(springrecord2);
		mySection.add(springrecord3);
		// Create an array list for student
		ArrayList<Student> myStudent = new ArrayList<Student>();
		// Create 10 instances of student
		Date now = new Date();
		Date DOB = now;
		Student student1 = new Student("Jose", "A.", "Valdez", DOB, eMajor.PHYSICS, "121 Delamore St.", "302-356-7563", "jvaldez@udel.edu");
		Student student2 = new Student("Jose", "J.", "Vasquez", DOB, eMajor.PHYSICS, "215 Woodmill Dr.", "302-355-9468", "jvasquez@udel.edu");
		Student student3 = new Student("Martha", "G.", "Lopez", DOB, eMajor.NURSING, "105 Sunville St.", "302-985-6325", "mlopez@udel.edu");
		Student student4 = new Student("Mauricio", "N.", "Ferrato", DOB, eMajor.PHYSICS, "231 Lancaster Ave.", "302-312-9841", "mferrato@udel.edu");
		Student student5 = new Student("Mohammed", "A.", "Magied", DOB, eMajor.BUSINESS, "148 Greenville Dr.", "302-590-6233", "mmagied@udel.edu");
		Student student6 = new Student("Arpan", "T.", "Patel", DOB, eMajor.BUSINESS, "110 Rodney St.", "302-595-7432", "apatel@udel.edu");
		Student student7 = new Student("Ana", "R.", "Vega", DOB, eMajor.NURSING, "105 Union St.", "302-581-6782", "avega@udel.edu");
		Student student8 = new Student("Tyler", "S.", "Nicholes", DOB, eMajor.COMPSI, "156 West 7th St.", "302-398-4472", "tnicholes@udel.edu");
		Student student9 = new Student("Cameron", "A.", "Johnson", DOB, eMajor.BUSINESS, "124 Market Ave.", "302-589-4325", "cjohnson@udel.edu");
		Student student10 = new Student("Javon", "J.", "Deputy", DOB, eMajor.BUSINESS, "142 West 3rd St.", "302-953-2514", "jdeputy@udel.edu");
		// Add them to the array
		myStudent.add(student1);
		myStudent.add(student2);
		myStudent.add(student3);
		myStudent.add(student4);
		myStudent.add(student5);
		myStudent.add(student6);
		myStudent.add(student7);
		myStudent.add(student8);
		myStudent.add(student9);
		myStudent.add(student10);
	}

	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
