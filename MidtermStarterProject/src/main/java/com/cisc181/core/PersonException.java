package com.cisc181.core;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonException extends Exception {
	// Instance of person
	private Person Person;
	
	// Current Date
	Date today = new Date();
	
	// To validate phone number
	String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
	Pattern pattern = Pattern.compile(regex);

	public PersonException(Person Person){
		this.Person = Person;
		// To check the format of the phone number
		Matcher matcher = pattern.matcher(this.Person.getPhone());
		/** I tried really hard to solve how to set it 100 years from
		 * today's date but I couldn't figure it out so I set it so
		 * the person's birthday can't equal to today's date.
		 */
		if (this.Person.getDOB() == today){
			System.out.println("Incorrect date of birth.");
			} else if (matcher.matches() != true){
				System.out.println("The phone number isn't formatted correctly.");
			}
	}
}
