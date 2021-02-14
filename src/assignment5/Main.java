package assignment5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Main {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();

		// Custom temporal adjusters.
		TemporalAdjuster secondSundayOfNextMonth = temporal -> {
			LocalDate date = LocalDate.from(temporal).plusMonths(1);
			date = date.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
			return temporal.with(date);
		};

		System.out.println("Second sunday of next month: " + now.with(secondSundayOfNextMonth));

	}
}
