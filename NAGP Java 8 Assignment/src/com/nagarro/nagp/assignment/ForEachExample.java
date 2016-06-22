/**
 * ForEachExample.java
 *
 * @author harleenchadha
 *
 * 29-Oct-2015
 */
package com.nagarro.nagp.assignment;

import java.util.Arrays;
import java.util.List;

/**
 * The Class ForEachExample prints the contents of the user list.
 */
public class ForEachExample {
	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(final String args[]) {
		List<User> users = Arrays.asList(
				new User(1118, "Harleen", "Chadha", 23), new User(1119,
						"Nayika", "Syal", 22), new User(1094, "Madhur",
						"Arora", 21), new User(1101, "Akhila", "Saini", 24),
				new User(1064, "Srishti", "Khanna", 22));

		// Printing the contents of the user list
		System.out.println("Contents of the user list:");
		users.forEach(u -> System.out.printf(
				"Id:%d, First Name:%s, Last Name:%s, Age:%d\n", u.getId(),
				u.getFirstName(), u.getLastName(), u.getAge()));
		System.out.println("harleen");
		System.out.println("harleen1");
		System.out.println("harleen1");
	}
}