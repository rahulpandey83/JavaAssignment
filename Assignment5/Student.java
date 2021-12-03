package Assignment5;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	private String firstName;
	private Address address;
	private String dateOfBirth;
	
	@Override
	
	public String toString() {
		return "Students [firstName=" + firstName + ", dateOfBirth=" + dateOfBirth + ", address=" + address + "]";

	}
	public Student(String firstName, String dateOfBirth, Address address) {
		this.firstName = firstName;
		this.address = address;
		this.dateOfBirth = dateOfBirth;

	}
}
