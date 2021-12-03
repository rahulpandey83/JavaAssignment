package Assignment5;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;

import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationTest {

	public static void main(String[] args) throws IOException{

		Address address1 = new Address("Mhow", "M.P.", 452001, "India");
		Student student1 = new Student("Rahul", "24-JUN-1999", address1);

		Address address2 = new Address("Indore", "M.P.", 452001, "India");
		Student student2 = new Student("Nikhil", "24-aug-1999", address2);
		
		Address address3 = new Address("Indore", "M.P.", 452001, "India");
        Student student3 = new Student("Ojasvi", "06-jun-1999", address3);

		Address address4 = new Address("Dewas", "M.P.", 455001, "India");
        Student student4 = new Student("Supriya", "28-mar-1999", address4);

		List<Student> list = new ArrayList<Student>();
		list.add(student1);
		list.add(student2);

		try 
		{
			FileOutputStream fileOutputStream = new FileOutputStream("student.txt",true);
		
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(list);
			objectOutputStream.close();
			System.out.println("Write succesfully");
		} 
		catch (FileNotFoundException fileNotFoundException)
		{
			fileNotFoundException.getMessage();
		}
		catch (IOException ioException)
		{
			ioException.getMessage();
		}
	}
}
