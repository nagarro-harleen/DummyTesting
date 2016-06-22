/**
 * SortByAgeExample.java
 *
 * @author harleenchadha
 *
 * 29-Oct-2015
 */
package com.nagarro.nagp.assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * The Class SortByAgeExample sorts the list of users on the basis of id through
 * lambda expression.
 */
public class SortByAgeExample {
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

		// Sorting the list of users on the basis of id through lambda
		// expression
		Collections.sort(users, (id1, id2) -> id1.getId()
				.compareTo(id2.getId()));

		// Printing the sorted list of users
		System.out.println("Sorted list of users on the basis of ID:");
		users.forEach(u -> System.out.printf(
				"Id:%d, First Name:%s, Last Name:%s, Age:%d\n", u.getId(),
				u.getFirstName(), u.getLastName(), u.getAge()));
	}
}