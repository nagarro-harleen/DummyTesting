/**
 * DateTimeExample.java
 *
 * @author harleenchadha
 *
 * 29-Oct-2015
 */
package com.nagarro.nagp.assignment;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

/**
 * The Class DateTimeExample accesses the current instant, date and time using a
 * time-zone.
 */
public class DateTimeExample {
	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(final String args[]) {
		DateTimeExample dateTimeExample = new DateTimeExample();
		dateTimeExample.instantExample();
		dateTimeExample.localDateAndTimeExample();
		dateTimeExample.timeZonesExample();
	}

	/**
	 * Instant example shows the usage of Instant class used to work with
	 * machine readable time format
	 */
	private void instantExample() {
		System.out.println("Instant examples:");
		// Get the current date time
		Instant now = Instant.now();
		Instant instant = Instant.now();

		// Output format is ISO-8601
		System.out.println("Current Date/Time: " + now);
		System.out
				.println("Instant is immutable, so instant==instant returns: "
						+ (now == instant));

		// Converting a java.util.Date into an Instant
		instant = Instant.ofEpochMilli(new Date().getTime());
		System.out.println("Converting a java.util.Date into an Instant: "
				+ instant);

		// Creating Instant from a String
		instant = Instant.parse("1995-10-23T10:12:35Z");
		System.out.println("Creating Instant from a String: " + instant);

		// Adding 5 hours and 4 minutes to an Instant
		System.out.println("Adding 5 hours and 4 minutes to an Instant: "
				+ now.plus(Duration.ofHours(5).plusMinutes(4)));

		// Subtract 5 days from an instant
		System.out.println("Subtract 5 days from an instant: "
				+ now.minus(Duration.ofDays(5)));
	}

	/**
	 * Local date and time example shows the usage of LocalDate, LocalTime and
	 * TemporalAdjusters classes.
	 */
	private void localDateAndTimeExample() {
		System.out.println("\nLocalDate and Local Time examples:");
		LocalDate localDate = LocalDate.now();
		System.out.println("Current Date: " + localDate);

		// Temporal Adjusters example
		LocalDate adjusted = localDate.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("Last day of current month: " + adjusted);

		// The 86th day of 2005(27-Mar-2005)
		localDate = LocalDate.ofYearDay(2005, 86);
		System.out.println("The 86th day of 2005: " + localDate);

		// 10th of August 2013
		localDate = LocalDate.of(2013, Month.AUGUST, 10);
		System.out.println("10th of August 2013: " + localDate);

		// 10:33 PM
		LocalTime localTime = LocalTime.of(22, 33);
		System.out.println("Time: " + localTime);

		localTime = LocalTime.now();
		System.out.println("Current Time: " + localTime);

		// The 4,503 second in a day (1:15:30 AM)
		localTime = LocalTime.ofSecondOfDay(4503);
		System.out.println("The 4,503 second in a day: " + localTime);
	}

	/**
	 * Time zones example shows the usage of zone specific date and time.
	 */
	private void timeZonesExample() {
		System.out.println("\nTime Zones examples:");

		// Displaying current time in all the available time zones
		ZoneId.SHORT_IDS
				.keySet()
				.stream()
				.forEach(
						zoneKey -> System.out.println(ZoneId
								.of(ZoneId.SHORT_IDS.get(zoneKey))
								+ ": "
								+ LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS
										.get(zoneKey)))));

		// Date and time with time zone in Java 8
		ZoneId america = ZoneId.of("America/New_York");
		LocalDateTime localtDateAndTime = LocalDateTime.now();
		ZonedDateTime dateAndTimeInNewYork = ZonedDateTime.of(
				localtDateAndTime, america);
		System.out.println("Current date and time in America/New_York: "
				+ dateAndTimeInNewYork);

		// Leaving from San Francisco on July 20, 2013, at 7:30 p.m.
		LocalDateTime leaving = LocalDateTime.of(2013, Month.JULY, 20, 19, 30);
		ZoneId leavingZone = ZoneId.of("America/Los_Angeles");
		ZonedDateTime departure = ZonedDateTime.of(leaving, leavingZone);
		System.out.println("Leaving: " + departure);

		// Flight is 10 hours and 50 minutes, or 650 minutes
		ZoneId arrivingZone = ZoneId.of("Asia/Tokyo");
		ZonedDateTime arrival = departure.withZoneSameInstant(arrivingZone)
				.plusMinutes(650);
		System.out.println("Arrival: " + arrival);
		System.out.println("harleen");
		System.out.println("harleen1");
		System.out.println("harleen1");
	}
}