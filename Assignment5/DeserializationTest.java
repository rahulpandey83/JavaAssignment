package Assignment5;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeserializationTest {
    public static void main(String[] args) throws FileNotFoundException {

        try (FileInputStream fileInputStream = new FileInputStream("student.txt")) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

				@SuppressWarnings("unchecked")
				List<Student> studentDetails = (ArrayList<Student>) objectInputStream.readObject();

                if (studentDetails != null) {
                    for (Student student : studentDetails) {
                        System.out.println(student.toString());
                    }
                }

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
