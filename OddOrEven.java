package basicOpenLabBook;

import java.util.Scanner;

public class OddOrEven {
static int checkOddorEven(){
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = reader.nextInt();
	if(num%2==0) {
		System.out.println("The number is even");
	}
	else {
		System.out.println("The number is odd");
	}
	return num;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkOddorEven();
	}

}
