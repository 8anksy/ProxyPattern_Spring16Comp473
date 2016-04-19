import java.math.BigDecimal;

public class StudentImpl implements Student {
	private int id;
	private String firstName;
	private String lastName;
	private double gpa;
	private int ssn;
	private BigDecimal accountBalance;
	
	public StudentImpl () {
		this( 123456, "first", "last");
		System.err.println("Creating new student... \n");
	}
	
	public StudentImpl (int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = 4.0;
		this.ssn = 333224444;
		this.accountBalance = new BigDecimal(0.0).setScale(2,BigDecimal.ROUND_HALF_EVEN);
		System.err.println("Creating new student...");
	}
	
	public void getInfo() {
		System.out.println(getId() + ": " + getLastName() + ", " +
				getFirstName() + "\n");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
}
