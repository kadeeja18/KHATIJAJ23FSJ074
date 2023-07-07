package basicOpenLabBook;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the dividend");
		int divident = reader.nextInt();
		System.out.println("Enter the divisor");
		int divisor = reader.nextInt();
		System.out.println("The quotient of the above calci is " + divident/divisor);
		System.out.println("The quotient of the above calci is " + divident%divisor);
		
	}

}
