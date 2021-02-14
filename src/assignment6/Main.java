package assignment6;

import java.time.LocalDate;
import java.time.Period;

public class Main {

	public static void main(String[] args) {
		LocalDate jobJoinedDate = LocalDate.of(2020, 9, 18);
		LocalDate now = LocalDate.now();

		Period diff = Period.between(jobJoinedDate, now);

		System.out.printf("My Experience in Wipro:\n%d years, %d months and %d days old", diff.getYears(), diff.getMonths(),
				diff.getDays());
	}
}
