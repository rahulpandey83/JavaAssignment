package Assignment2;

public class ShapeCalculation {
	public void calculateAreaAndPerimeterOfCircle(int circleRadius) {

		int radius = 0;
		double area, circumference;
		radius = circleRadius;
		area = Math.PI * (radius * radius);// calculating area of circle
		System.out.println(" area of circle with radius " + radius + " is: " + area);

		circumference = Math.PI * 2 * radius;// calculating area of circumference
		System.out.println("circumference of circle with radius " + radius + " is: " + circumference);

	}

	public void calculateAreaAndPerimeterOfTriangle(double triangleHeight, double triangleBreadth, double sideValueA,
			double sideValueB, double sideValueC) {

		double height = 0, breadth = 0, area;
		double sideA = 0, sideB = 0, sideC = 0, parimeter;
		height = triangleHeight;
		breadth = triangleBreadth;
		sideA = sideValueA;
		sideB = sideValueB;
		sideC = sideValueC;

		area = height * breadth / 2;// calculating area of triangle
		parimeter = (sideA + sideB) + sideC;// calculating parimeter of triangle
		System.out.println(" area of Triangle with height = " + height + " and breadth = " + breadth + " is: " + area);
		System.out.println(" parimeter of triangle  with values of  sideA = " + sideA + " sideB = " + sideB
				+ " and sideC = " + sideC + " is: " + parimeter);

	}

	public void calculateAreaAndPerimeterOfRectangle(double rectangleLength, double rectangleWidth) {
		double length = 0, width = 0, area, parimeter;
		width = rectangleWidth;
		length = rectangleLength;

		area = length * width;// calculating area of rectangle
		System.out
				.println(" parimeter of Rectangle with length = " + length + " and witdh = " + width + " is: " + area);
		parimeter = 2 * (length + width);// calculating parimeter of rectangle
		System.out.println(
				" parimeter of Rectangle with length = " + length + " and witdh = " + width + " is: " + parimeter);

	}

	public void calculateAreaAndPerimeterOfSquare(double sideValue) {
		double area, parameter, side = 0;
		side = sideValue;

		area = side * side;// calculating area of Square
		parameter = 4 * side;// calculating parimeter of Square
		System.out.println("area of square with side = " + side + " is: " + area);
		System.out.println("parameter of circle with side = " + side + " is: " + parameter);

	}

	public void calculateSurfaceAreaAndVolumeOfSphere(double sphereRadius) {
		double surfaceArea, volume, radius = 0;
		radius = sphereRadius;

		surfaceArea = 4 * Math.PI * radius * radius;// calculating surface area of sphere
		volume = (4.0 / 3) * Math.PI * radius * radius * radius;// calculating volume of sphere
		System.out.println("surface area of sphere with" + radius + "is:" + surfaceArea);
		System.out.println("volume  of sphere with" + radius + "is:" + volume);

	}

	public void calculateSurfaceAreaAndVolumeOfCylinder(double cylinderHeight, double cylinderRadius) {
		double radius = 0, height = 0, volume, surfaceArea;
		height = cylinderHeight;
		radius = cylinderRadius;

		surfaceArea = 2 * Math.PI * radius * (radius + height);// calculating surface area of cylinder
		volume = Math.PI * radius * radius * height;// calculating volume of cylinder
		System.out.println(
				"surface area of cylinder with height = " + height + "and radius = " + radius + " is:" + surfaceArea);
		System.out.println("volume  of cylinder with height = " + height + "and radius = " + radius + " is: " + volume);

	}

}
