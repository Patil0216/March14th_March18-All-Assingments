package Java.Fundamentals;

public class MARCH15_employee {
	int Id;
	String name;
	String department;
	String workplocation = "Banglore";

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getWorkplocation() {
		return workplocation;
	}

	public void setWorkplocation(String workplocation) {
		this.workplocation = workplocation;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MARCH15_employee e1 = new MARCH15_employee();
		e1.setId(1212);
		e1.setName("neha");
		e1.setDepartment("Mechanical");
		System.out.println(e1.Id);
		System.out.println(e1.name);
		System.out.println(e1.department);
		System.out.println(e1.workplocation);
		System.out.println();
		MARCH15_employee e2 = new MARCH15_employee();
		e2.setId(1233);
		e2.setName("pritam");
		e2.setDepartment("Automation");
		System.out.println(e2.Id);
		System.out.println(e2.name);
		System.out.println(e2.department);
		System.out.println(e2.workplocation);
		System.out.println();
		MARCH15_employee e3 = new MARCH15_employee();
		e3.setId(1244);
		e3.setName("anuja");
		e3.setDepartment("trainee");
		System.out.println(e3.Id);
		System.out.println(e3.name);
		System.out.println(e3.department);
		System.out.println(e3.workplocation);
	}

}
