package library;

public class Student extends Person {
	private String studentId;
	private String user;
	private String password;

	public Student() {

	}

	public Student(String studentId, String user, String password) {
		super();
		this.studentId = studentId;
		this.user = user;
		this.password = password;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
