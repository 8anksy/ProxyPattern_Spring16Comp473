
public class StudentProxy implements Student {
	
	private StudentImpl student;
	private int id;
	private String firstName;
	private String lastName;
	
	public StudentProxy (int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void getInfo() {
		if (student == null) {
			student = new StudentImpl(id, firstName, lastName);
		}
		student.getInfo();
	}
	
	public int getId() {
		return student.getId();
	}
	public String getFirstName() {
		return student.getLastName();
	}
	public String getLastName(){
		return student.getLastName();
	}

}
