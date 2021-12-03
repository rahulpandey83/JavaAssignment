package Assignment3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Employee implements EmployeeDetails{
	Scanner sc= new Scanner(System.in);
	
	private String employeeId;
	private String employeeName;
	private String employeeEmail;
	private String employeeAge;
	private String employeeDateOfBirth;
	

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
	@Override
	public void addEmployeeDetailsInFile(ArrayList<String> list) {

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("employee.txt", true));

			for (String x : list) {
				writer.write(x);
				writer.newLine();
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
   }

	

	@Override
	public void searchEmployeeInFile(String fileName,String searchEmployee){
		
		 BufferedReader reader;
	
		try {
			 File file = new File(fileName);
			reader = new BufferedReader(new FileReader(file));
			while(reader.readLine() != null){
	            String line = reader.readLine().toLowerCase().toString();
	           // Collections.sort(list);
	            if(line.contains(searchEmployee)){
	            	System.out.println("Searched  is:");
	                System.out.println("[ Employee id , Name , Email , Age ,Date of brith ] : " +line);
	            }
	         
	        }
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Searched  is:");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        
	    } 

	@Override
	public void deleteInformationInFile(ArrayList<String> list, String delete) {

		try {
			PrintWriter pw = new PrintWriter("employee.txt");

			BufferedReader reader = new BufferedReader(new FileReader("employee.txt"));

			String line1 = reader.readLine();

			while (line1 != null) {
				boolean flag = false;
				BufferedReader reader2 = new BufferedReader(new FileReader("employee.txt"));

				String line2 = reader2.readLine();

				// loop for each line of delete.txt
				while (line2 != null) {
					if (line1.equals(line2)) {
						flag = true;
						break;
					}

					line2 = reader2.readLine();
				}

				if (!flag)
					pw.println(line1);

				line1 = reader.readLine();
                reader2.close();
			}
		pw.flush();
	    pw.close();
		reader.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println("Employee Details deleted");
	
	}

}
