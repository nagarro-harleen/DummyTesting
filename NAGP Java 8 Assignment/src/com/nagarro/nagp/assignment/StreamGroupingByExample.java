/**
 * StreamGroupingByExample.java
 *
 * @author harleenchadha
 *
 * 29-Oct-2015
 */
package com.nagarro.nagp.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The Class SteamGroupingByExample group users by their age using new stream
 * API
 */
public class StreamGroupingByExample {
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

		// Grouping users by their age using new stream API
		System.out.print("Grouping users by their age:");
		users.stream()
				.collect(Collectors.groupingBy(User::getAge))
				.forEach(
						(k, v) -> {
							System.out.printf("\nAge:%d -", k);
							v.forEach(u -> System.out.printf(
									" Id:%d, First name:%s, Last Name:%s ",
									u.getId(), u.getFirstName(),
									u.getLastName()));
						});
	}
}