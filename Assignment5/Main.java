package Assignment5;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) throws ParseException {
		String firstName;
		String dateOfBirth;
		String city;
		String state;
		int pincode;
		String country;

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter choice");
			System.out.println("1 serialization first");
			System.out.println("2.DeSerialization first");
			System.out.println("3.serialization second");
			System.out.println("4.DeSerialization second");
			System.out.println("5.Exit");
			int number = sc.nextInt();

			switch (number) {
			case 1:

				System.out.println("Enter Student Name : ");
				firstName = sc.next();
				System.out.println("Enter Date Of Birth : ");
				dateOfBirth = sc.next();
				
				SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
				Date dob = dateFormat1.parse(dateOfBirth);
			
				System.out.println("Enter Address Of Student ");
				System.out.println("Enter City ");
				city = sc.next();
				System.out.println("Enter State ");
				state = sc.next();
				System.out.println("Enter pincode");
				pincode = sc.nextInt();
				System.out.println("Enter country");
				country = sc.next();
				
				Address address1 = new Address(city, state, pincode, country);
				Student student1 = new Student(firstName, dob, address1);
				SerializationTest serialize1 = new SerializationTest();
				try {
					serialize1.serialiaztion1(student1);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			case 2:
				DeserializationTest desirialize1 = new DeserializationTest();
				desirialize1.deserialization1();
				break;
			case 3:

				System.out.print("Enter Student Name : ");
				firstName = sc.next();
				System.out.println("Enter Date Of Birth : ");
				dateOfBirth = sc.next();
				
				SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
				Date dob2= dateFormat2.parse(dateOfBirth);
				
			
				System.out.println("Enter Address Of Student ");
				System.out.println("Enter City ");
				city = sc.next();
				System.out.println("Enter State ");
				state = sc.next();
				System.out.println("Enter pincode");
				pincode = sc.nextInt();
				System.out.println("Enter country");
				country = sc.next();

				Address address2 = new Address(city, state, pincode, country);
				Student student2 = new Student(firstName, dob2, address2);
				SerializationTest serialize2 = new SerializationTest();
				try {
					serialize2.serialiaztion2(student2);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				DeserializationTest desirialize2 = new DeserializationTest();
				desirialize2.deserialization2();
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid choice");
				sc.hasNext();

			}
		} while (true);
	}
}
