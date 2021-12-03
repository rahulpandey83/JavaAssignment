package Assignment2;
import java.util.InputMismatchException;
import java.util.*;

public class ClassMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("MENU:");
				System.out.println("1. Circle");
				System.out.println("2. Triangle");
				System.out.println("3. Rectangle");
				System.out.println("4. Square");
				System.out.println("5. Shpere");
				System.out.println("6. Cylinder");
				System.out.println("7. Exit");
				System.out.println("Please enter any of the above option: ");
				int num = sc.nextInt();
				if (num > 7 || num < 0) {
					System.out.println("Invalid choice ");
				} else {
					switch (num) {
					case 1:
						ShapeCalculation circle = new ShapeCalculation();
						System.out.print("Enter the radius of the circle");
						int circleRadius = sc.nextInt();
						circle.calculateAreaAndPerimeterOfCircle(circleRadius);
						break;

					case 2:
						ShapeCalculation Triangle = new ShapeCalculation();
						System.out.println("Enter the height and breadth for calculating area of the Triangle");
						System.out.println("1.Enter the height of the Triangle");
						double triangleHeight = sc.nextDouble();
						System.out.println("2.Enter the breadth of the Triangle");
						double triangleBreadth = sc.nextDouble();

						System.out.println("Enter the sides for calculating parameter of the Triangle");

						System.out.println("Enter the value of side A");
						double sideA = sc.nextDouble();
						System.out.println("Enter the value of side B");
						double sideB = sc.nextDouble();
						System.out.println("Enter the value of side C");
						double sideC = sc.nextDouble();

						Triangle.calculateAreaAndPerimeterOfTriangle(triangleHeight, triangleBreadth, sideA, sideB,
								sideC);
						break;

					case 3:
						ShapeCalculation Rectangle = new ShapeCalculation();
						System.out.println("Enter the length and width for calculating area and parameter of Triangle");
						System.out.print("Enter the lenght of the Rectangle");
						double rectanglelength = sc.nextDouble();
						System.out.print("Enter the width of the Rectangle");
						double rectangleWidth = sc.nextDouble();
						Rectangle.calculateAreaAndPerimeterOfRectangle(rectanglelength, rectangleWidth);
						break;

					case 4:
						ShapeCalculation Square = new ShapeCalculation();
						System.out.print("Enter the side of the square");
						double squareSide = sc.nextDouble();
						Square.calculateAreaAndPerimeterOfSquare(squareSide);
						break;

					case 5:
						ShapeCalculation Sphere = new ShapeCalculation();
						System.out.print("Enter the side of the square");
						double sphereRadius = sc.nextDouble();
						Sphere.calculateSurfaceAreaAndVolumeOfSphere(sphereRadius);
						break;
					case 6:
						ShapeCalculation Cylinder = new ShapeCalculation();
						System.out
								.println("Enter radius and height for calculating surface area and volume of cylinder");
						System.out.println("Enter the height of cylinder");
						double cylinderHeight = sc.nextDouble();
						System.out.println("Enter the radius of cylinder");
						double cylinderRadius = sc.nextDouble();
						Cylinder.calculateSurfaceAreaAndVolumeOfCylinder(cylinderHeight, cylinderRadius);
						break;
					case 7:

						System.exit(0);
					default:
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("invalid value :please provide valid value");
			} catch (ArithmeticException e) {
				System.out.println("Error");
			}

			sc.nextLine();

		} while (true);
	}


}
