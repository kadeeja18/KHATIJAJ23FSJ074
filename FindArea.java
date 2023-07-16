package basicOpenLabBook;

import java.util.Scanner;

public class FindArea {
	static Scanner input = new Scanner(System.in);

	static float areaofRectangle() {

		System.out.println("Enter the length");
		float length = input.nextFloat();
		System.out.println("Enter the Breadth");
		float breadth = input.nextFloat();
		float calci = length * breadth;
		return calci;
	}

	static double areaofCircle() { // pi*r*r

		System.out.println("Enter the Radius");
		double radius = input.nextDouble();
//		System.out.println("Enter the Breadth");
//		float breadth = input.nextFloat();
		double calci = Math.PI * radius * radius;
		return calci;
	}

	static float AreaOfSquare() {

		System.out.println("Enter the side");
		float side = input.nextFloat();
		float calci = side * side;
		return calci;
	}

	static float areaOfTriangle() {

		System.out.println("Enter the base");
		float base = input.nextFloat();
		System.out.println("Enter the Height");
		float height = input.nextFloat();
		float calci = (base * height) / 2;
		return calci;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// TODO Auto-generated method stub
		System.out.println("Please click\n 1. For Rectangle\n2. For Circle\n3. For Square\n4. For Triangle ");
		int answer = input.nextInt();
		if (answer == 1) {
			System.out.println("The area of the Rectangle is "+  areaofRectangle());
		}
		else if (answer == 2) {
			System.out.println("The area of the Circle is "+ areaofCircle());
		}
		else if (answer == 3) {
			System.out.println("The area of the Square is "+ AreaOfSquare());
		}
		else if (answer == 4) {
			System.out.println("The area of the Triangle is "+ areaOfTriangle());
		}
		else {
			System.out.println("Sorry Not available");
		}
	}

}
