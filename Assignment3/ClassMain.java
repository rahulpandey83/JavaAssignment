package Assignment3;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class ClassMain {
	public static boolean emailCheck(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";

		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}

	public static boolean stringCheck(String string) {
		return string != null && string.matches("^[a-zA-Z]*$");
	}

	public static boolean numberCheck(String number) {
		try {
			Integer.parseInt(number);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		do {
			try {

				System.out.println("ENTER YOUR CHOICE");
				System.out.println("Menu");
				System.out.println("1.ADD");
				System.out.println("2.SEARCH");
				System.out.println("3.DELETE");
				System.out.println("4.EXIT");

				int choice = sc.nextInt();
				Employee employee = new Employee();
				switch (choice) {
				case 1:
					String employeeId;
					String employeeName;
					String employeeEmail;
					String employeeAge;
					String employeeDateOfBirth;

					System.out.println("Enter Employee Id:");
					do {
						employeeId = sc.next();
						if (numberCheck(employeeId))
							break;
						else
							System.out.println("Entered Invaild Id\t Enter only  Number");
					} while (!numberCheck(employeeId));
					employee.setEmployeeId(employeeId);

					System.out.println("Enter Employee Name");
					do {
						employeeName = sc.next();
						if (stringCheck(employeeName))
							break;
						else
							System.out.println(" Entered invaild Employee Name\n Enter only Character");
					} while (!stringCheck(employeeName));
					employee.setEmployeeName(employeeName);

					System.out.println("Enter employee email : (XYZ@gmail.com) Format only");
					do {
						employeeEmail = sc.next();
						if (emailCheck(employeeEmail))
							break;
						else
							System.out.println(" Entered invaild Employee Email\n ReEnter valid Email in Given Format");
					} while (!emailCheck(employeeEmail));
					employee.setEmployeeEmail(employeeEmail);

					System.out.println("Enter employee Age");
					do {
						employeeAge = sc.next();
						if (numberCheck(employeeAge))
							break;
						else
							System.out.println("Entered Invaild Age\t Enter only  Numeric value");
					} while (!numberCheck(employeeAge));
					employee.setEmployeeAge(employeeAge);

					System.out.println("Enter employee date of birth : (mm/dd/yyyy) Formate only");
					employeeDateOfBirth = sc.next();
					SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
					sdf.setLenient(false);
					try {
						sdf.parse(employeeDateOfBirth);
						employee.setEmployeeDateOfBirth(employeeDateOfBirth);

						new Employee(employeeName, employeeId, employeeEmail, employeeAge, employeeDateOfBirth);
						//.add(employee.toString());
						employee.addEmployeeDetailsInFile();
                        
					} catch (Exception e) {
						System.out.println("Invalid Date Of Birth Format");
					}
					break;

				case 2:
					System.out.println("Enter Employee Id you Want to search ");
					String search = sc.next();
					employee.searchEmployeeInFile("emp.txt", search);
					break;
					
				case 3:
					System.out.println("Enter Employee Id you Want to delete");
					String delete = sc.next();
					employee.deleteInformationInFile(list, delete);
					break;
					
				case 4:
					System.exit(0);
				default:
					System.out.println("Invalid choice");
				}
			} catch (InputMismatchException e) {
				System.out.println("Wrong Input! ENTER YOUR CHOICE");
				sc.close();
			}

		} while (true);
	}

}
