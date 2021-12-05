package Assignment3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Employee implements EmployeeDetails {

	private String employeeId;
	private String employeeName;
	private String employeeEmail;
	private String employeeAge;
	private String employeeDateOfBirth;
	private Scanner sc;

	public Employee() {
		super();
	}

	public Employee(String employeeName, String employeeId, String employeeEmail, String employeeAge,
			String employeeDateOfBirth) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeEmail = employeeEmail;
		this.employeeAge = employeeAge;
		this.employeeDateOfBirth = employeeDateOfBirth;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;

	}

	public String getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(String employeeAge) {
		this.employeeAge = employeeAge;
	}

	public void setEmployeeDateOfBirth(String employeeDateOfBirth) {
		this.employeeDateOfBirth = employeeDateOfBirth;
	}

	public String getEmployeeDateOfBirth() {
		return employeeDateOfBirth;
	}

	public String toString() {
		return employeeId + "," + employeeName + "," + employeeEmail + "," + employeeAge + "," + employeeDateOfBirth;

	}

	@Override
	public void addEmployeeDetailsInFile() {
//
//		String employeeId = getEmployeeId();
//		String employeeName = getEmployeeName();
//		String employeeEmail = getEmployeeEmail();
//		String employeeAge = getEmployeeAge();
//		String employeeDateOfBirth = getEmployeeDateOfBirth();
		 ArrayList<String> list = new ArrayList<String>();
		 list.add(toString());
	
		try {

			BufferedWriter writer = new BufferedWriter(new FileWriter("emp.txt", true));
			Set<String> set = new HashSet<String>(list);
			for (String lines : set) {
				writer.write(lines);
				writer.newLine();
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void searchEmployeeInFile(String fileName, String searchEmployee) {
		boolean found = false;
		String id = "";
		String name = "";
		String email = "";
		String age = "";
		String dob = "";
		try {

			sc = new Scanner(new File(fileName));
			sc.useDelimiter("[ , \n]");
			while (sc.hasNext() && !found) {
				id = sc.next();
				name = sc.next();
				email = sc.next();
				age = sc.next();
				dob = sc.next();
				if (id.equals(searchEmployee)) {
					found = true;
				}
			}
			if (found) {
				System.out.println(" [Employee] Id = " + id + " , Name = " + name + " , Email = " + email + " , Age = "
						+ age + " , DoB = " + dob);
			} else {
				System.out.println("Employee Not Found !!");
			}
		} catch (Exception e) {
			System.out.println(" OOPS!!! Somethings gone wrong");
		}

	}

	@Override
	public void deleteInformationInFile(ArrayList<String> list, String delete) {
		String id = "";
		String name = "";
		String email = "";
		String age = "";
		String dob = "";
        String filePath = "emp.txt";
		File NewFile = new File("empp.txt");
		File oldFile = new File(filePath);

		try {

			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("empp.txt", true));
			PrintWriter printWriter = new PrintWriter(bufferedWriter);
			sc = new Scanner(new File(filePath));
			sc.useDelimiter("[,\n]");

			while (sc.hasNext()) {
				id = sc.next();
				name = sc.next();
				email = sc.next();
				age = sc.next();
				dob = sc.next();
				if (!id.equals(delete)) {
					printWriter.println(id + "," + name + "," + email + "," + age + "," + dob);
				}
			}
			
				printWriter.flush();
				printWriter.close();
				oldFile.delete();
				File dump = new File(filePath);
				NewFile.renameTo(dump);
			

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println("Employee Details deleted");

	}

}
