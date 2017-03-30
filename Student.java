// Honor Pledge: I pledge that I have neither given nor received any help on this assignment

public class Student {
	// Variables
	private String firstName;
	private String lastName;
	private Address address;
	private String studentId;
	private string gpa;
	
	//Constructors
	Student() {
	
	}
	
	Student(String firstNameIn, String lastNameIn, Address addressIn, String studentIdIn, String gpaIn) {
		firstName = firstNameIn;
		lastName = lastNameIn;
		address = addressIn;
		studentId = studentIdIn;
		gpa = gpaIn;
	}

	// Getters
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String get Address() {
		return address;
	}

	public String getStudentId() {
		return studentId;
	}

	public getGpa() {
		return gpa;
	}

	//Setters
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}

	public void setLastName(String newLastName) {
		lastName = newLastName;
	}

	public void setAddress(Address newAddress) {
		address = newAddress;
	}

	public void setStudentId(String newStudentId) {
		studentId = newStudentId;
	}

	public void setGpa(String newGpa) {
		gpa = newGpa;
	}
}
