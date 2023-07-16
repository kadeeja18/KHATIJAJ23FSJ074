package basicOpenLabBook;

import java.util.Scanner;

public class NestedSwitchCase {

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
			System.out.println("Whats the reason?1 or 2?");
			int reason = input.nextInt();
			switch (reason) {
			case 1: {
				System.out.println("Its because its huge");
				break;
			}
			case 2: {
				System.out.println("Its because am not putting enough efforts");
				break;
			}
			default: {
				System.out.println("I really dont know");
				break;
			}
			}
			break;
		}

		default: {
			System.out.println("I am confused");

			break;
		}
		}
	}

}
