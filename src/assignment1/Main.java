package assignment1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(1, "Vinay", "Chennai", 10000));
		list.add(new Employee(2, "Varun", "Hyderabad", 15000));
		list.add(new Employee(3, "Ram", "Bangalore", 20000));
		list.add(new Employee(4, "Riya", "Vizag", 25000));

		for (Employee e : list) {
			System.out.println(e.getId() + ", " + e.getName() + ", " + e.getAddress() + ", " + e.getSal());
		}
	}
}
