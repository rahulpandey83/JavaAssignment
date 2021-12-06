package Assignment5;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	private String firstName;
	 Address address;
	 private Date dateOfBirth;
	
	@Override
	
	public String toString() {
		return "Students [firstName=" + firstName + ", dateOfBirth=" + dateOfBirth + ", address=" + address + "]";

	}
	public Student(String firstName, Date dateOfBirth, Address address) {
		this.firstName = firstName;
		this.address = address;
		this.dateOfBirth = dateOfBirth;

	}
}
