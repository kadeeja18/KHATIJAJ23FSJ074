package basicOpenLabBook;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int i=1;
		System.out.println("Enter the number of rows");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for( i = 0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j+" ");
			}
		System.out.println();
		}
		System.out.println(n);
		{
			int rows, number = 1, counter, k;
			//To get the user's input
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the number of rows for floyd's triangle:");
			//Copying user input into an integer variable named rows
			rows = input.nextInt();
			System.out.println("Floyd's triangle");
			System.out.println("****************");
			for ( counter = 1 ; counter <= rows ; counter++ )
			{
			for ( k = 1 ; k <= counter ; k++ )
			{
			System.out.print(number+" ");
			//Incrementing the number value
			number++;
			}
			//For new line
			System.out.println();
			}
			}
			}
	}


