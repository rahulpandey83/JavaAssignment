package Assignment3;

import java.util.ArrayList;

public interface EmployeeDetails {
	 void addEmployeeDetailsInFile();
	 void searchEmployeeInFile(String fileName,String search);
	 void deleteInformationInFile(ArrayList<String>list,String delete);
}
