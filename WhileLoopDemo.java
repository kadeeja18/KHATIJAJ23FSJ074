package basicOpenLabBook;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		int sum = 0;
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number less than 10");
		int i = scan.nextInt();
		while(i<=10) {
			 sum = sum+i;
			i++;
			System.out.println(sum);
		}
		System.out.println("The sum of number from while loop is " + sum);
	}

}
