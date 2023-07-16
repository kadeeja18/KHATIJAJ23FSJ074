package basicOpenLabBook;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Do u like Java?");
		String answer = input.nextLine();
		switch (answer) {
		case "Yes": {
			System.out.println("I love Java");
			break;

		}
		case "No": {
			System.out.println("Sorry,I dont like Java");
			break;
		}
		default: {
			System.out.println("I am confused");
		}
			break;
		}

	}
}
