package basicOpenLabBook;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the letter");
		char ch = reader.next().charAt(0);
		if((ch=='a')|| (ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')){
			System.out.println("The entered letter '" + ch +"' is a Vowel ");
		}
		else {
			System.out.println("The entered letter '" + ch +"' is a Consonant ");

		}
	}

}
