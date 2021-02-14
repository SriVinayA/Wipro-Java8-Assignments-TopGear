package assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(1, "Vinay", "Chennai", 15000));
		list.add(new Employee(2, "Varun", "Hyderabad", 20000));
		list.add(new Employee(3, "Ram", "Bangalore", 25000));
		list.add(new Employee(4, "Riya", "Vizag", 10000));

		list.forEach((e)->System.out.println(e));
		
		System.out.println();
		Collections.sort(list,(e1,e2)->{
			return (e1.getSal()-e2.getSal());
		});
		
		list.forEach((e)->System.out.println(e));
	}
}
