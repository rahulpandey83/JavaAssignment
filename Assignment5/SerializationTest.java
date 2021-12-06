package Assignment5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;

import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerializationTest {

	public void serialiaztion1(Student student1) throws FileNotFoundException {

		try {
			FileOutputStream fileOutputStream1 = new FileOutputStream("output1.ser", true);

			try {
				ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(fileOutputStream1);

				ArrayList<Student> list = new ArrayList<Student>();
				list.add(student1);
				try {
					objectOutputStream1.writeObject(list);

					objectOutputStream1.close();

					System.out.println("Write succesfully");
				} catch (NotSerializableException notserializableExcepton) {
					notserializableExcepton.getMessage();
				}
			} catch (FileNotFoundException fileNotFoundException) {
				fileNotFoundException.getMessage();
			}
		} catch (IOException ioException) {
			ioException.getMessage();

		}
	}

	public void serialiaztion2(Student student2) throws FileNotFoundException {
		try {

			FileOutputStream fileOutputStream2 = new FileOutputStream("output2.ser", true);
			try {

				ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream2);
				ArrayList<Student> list = new ArrayList<Student>();
				list.add(student2);
				try {

					objectOutputStream2.writeObject(list);
					objectOutputStream2.close();
					System.out.println("Write succesfully");
				} catch (NotSerializableException notserializableExcepton) {
					notserializableExcepton.getMessage();
				}
			} catch (FileNotFoundException fileNotFoundException) {
				fileNotFoundException.getMessage();
			}
		} catch (IOException ioException) {
			ioException.getMessage();

		}

	}
}
