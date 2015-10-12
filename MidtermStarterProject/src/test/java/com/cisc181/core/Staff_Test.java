package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	Staff instance;
	Staff instance2;
	Staff instance3;
	Staff instance4;
	Staff instance5;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
	public void salary_test() {
		// Create 5 instances of Staff.
		Staff instance = new Staff(null, null, null, null, null, null, null, null, 0, 20000, null, null);
		Staff instance2 = new Staff(null, null, null, null, null, null, null, null, 0, 40000, null, null);
		Staff instance3 = new Staff(null, null, null, null, null, null, null, null, 0, 60000, null, null);
		Staff instance4 = new Staff(null, null, null, null, null, null, null, null, 0, 80000, null, null);
		Staff instance5 = new Staff(null, null, null, null, null, null, null, null, 0, 100000, null, null);

		// Create an ArrayList with the 5 instances
		ArrayList<Staff> myList = new ArrayList<Staff>();
		myList.add(instance);
		myList.add(instance2);
		myList.add(instance3);
		myList.add(instance4);
		myList.add(instance5);

		// Set salaries
		instance.setSalary(20000);
		instance2.setSalary(40000);
		instance3.setSalary(60000);
		instance4.setSalary(80000);
		instance5.setSalary(100000);

		assertEquals("The average of the 5 salaries should be $60,000. ", (double) 60000,
				(double) ((instance.getSalary() + instance2.getSalary() + instance3.getSalary() + instance4.getSalary()
						+ instance5.getSalary()) / 5),
				.001);
	}

}
