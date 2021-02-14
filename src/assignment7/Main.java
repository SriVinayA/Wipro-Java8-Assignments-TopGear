package assignment7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		//i. Create a list of string objects
		List<String> strList = Arrays.asList("abcdef", "", "bcda", "", "defg", "djk");
		
		//ii. Count no.strings whose length is> 5
		long num = strList.stream()
				.filter(x -> x.length()> 5)
				.count();
		System.out.println(num);
		
		//iii. Count no.of empty strings
		long count = strList.stream()
				.filter(x -> x.isEmpty())
				.count();
		System.out.println(count);
		
		//iv. Find out empty strings & store them into new list by using Stream API.
		List<String> filtered = strList.stream()
				.filter(x -> x.isEmpty())
				.collect(Collectors.toList());
		System.out.println(filtered);
	}
}
