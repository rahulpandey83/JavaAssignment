package Assignment5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeserializationTest {

	public void deserialization1() {
		try {
			FileInputStream fileInputStream1 = new FileInputStream("output1.ser");

			try {

				ObjectInputStream objectInputStream1 = new ObjectInputStream(fileInputStream1);

				@SuppressWarnings("unchecked")
				List<Student> studentDetails1 = (ArrayList<Student>) objectInputStream1.readObject();

				if (studentDetails1 != null) {
					for (Student student : studentDetails1) {
						System.out.println(student.toString());
					}
				}
				objectInputStream1.close();

			} catch (FileNotFoundException f) {
				f.getMessage();
			} catch (IOException ioException) {
				ioException.getMessage();
			} catch (ClassNotFoundException e) {
				e.getMessage();
			}
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}

	public void deserialization2() {
		try {
			FileInputStream fileInputStream2 = new FileInputStream("output2.ser");

			try {

				ObjectInputStream objectInputStream2 = new ObjectInputStream(fileInputStream2);

				@SuppressWarnings("unchecked")
				List<Student> studentDetails2 = (ArrayList<Student>) objectInputStream2.readObject();

				if (studentDetails2 != null) {
					for (Student student : studentDetails2) {
						System.out.println(student.toString());
					}
				}
				objectInputStream2.close();
				File file = new File("output2.ser");
				file.delete();
			} catch (FileNotFoundException f) {
				f.getMessage();
			} catch (IOException ioException) {
				ioException.getMessage();
			} catch (ClassNotFoundException e) {
				e.getMessage();
			}
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
}
