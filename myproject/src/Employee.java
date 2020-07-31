
public class Employee {
	int empAge;
	int salary;
	String designation;
	String name;
	
	public Employee(String name){
		
		this.name = name;
	}
	
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void displayEmployeeInformation(){
		
		System.out.println("Name :" + this.name);
		System.out.println("Age :" + this.empAge);
		System.out.println("Designaion" + this.designation);
		System.out.println("Salary" + this.salary);
	}
	
	public static void main(String[] args) {
		
		Employee empOne = new Employee("Scott");
		Employee empsec = new Employee("tiger");
		
		empOne.setEmpAge(25);
		empOne.setDesignation("HOD");
		empOne.setSalary(5609090);
		
		empsec.setEmpAge(50);
		empsec.setDesignation("DOD");
		empsec.setSalary(45000);		
		
		System.out.println("First Employee Information");
		empOne.displayEmployeeInformation();
		
		System.out.println("Second Employee Information");
		empsec.displayEmployeeInformation();		
	}	
}