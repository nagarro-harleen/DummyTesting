/**
 * StreamFilterExample.java
 *
 * @author harleenchadha
 *
 * 29-Oct-2015
 */
package com.nagarro.nagp.assignment;

import java.util.Arrays;
import java.util.List;

/**
 * The Class StreamFilterExample filter list of users having age greater than 45
 * years using stream API
 */
public class StreamFilterExample {
	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(final String args[]) {
		List<User> users = Arrays.asList(
				new User(1118, "Harleen", "Chadha", 23), new User(1119,
						"Nayika", "Syal", 22), new User(1094, "Amardeep",
						"Kaur", 47), new User(1101, "Gurdeep", "Singh", 50),
				new User(1064, "Srishti", "Khanna", 22));

		// Filtering list of users having age greater than 45 years using stream
		// API
		System.out
				.println("Filtered list of users having age greater than 45 years:");
		System.out.println("harleen");
		users.stream()
				.filter(u -> (u.getAge() > 45))
				.forEach(
						u -> System.out.printf(
								"Id:%d, First Name:%s, Last Name:%s, Age:%d\n",
								u.getId(), u.getFirstName(), u.getLastName(),
								u.getAge()));
	}
}