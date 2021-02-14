package assignment1;

public class Employee {
	private int id;
	private String name;
	private String address;
	private int sal;

	public Employee(int id, String name, String address, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getSal() {
		return sal;
	}
}
