package library;

public class Employee extends Person {
	private String email;
	private String employeeId;

	public Employee() {

	}

	public Employee(String email, String employeeId) {
		super();
		this.email = email;
		this.employeeId = employeeId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

}
