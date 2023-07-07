package basicOpenLabBook;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number 1");
		int number1 = reader.nextInt();
		System.out.println("Enter the number 2");
		int number2 = reader.nextInt();
		System.out.println("Enter the number 3");
		int number3 = reader.nextInt();
		if(number1>number2 && number1>number3) {
			System.out.println(number1+" is the largest number");
		}
		else if(number2>number1 &&number2>number3) {
			System.out.println(number2+" is the largest number");
		}
		else if
			(number1==number2 ||number2==number3 || number1==number3){
				System.out.println("Any of the 2 number is EQUAL.");
			}
		else {
			System.out.println(number3 + " is the largest number");
		}
	}

}
