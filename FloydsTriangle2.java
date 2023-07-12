package basicOpenLabBook;

import java.util.Scanner;

public class FloydsTriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows,counter=1,j,number =1;
		System.out.println("Enter the number of Rows");
		Scanner scan = new Scanner(System.in);
		rows = scan.nextInt();
		for(counter=1;counter<=rows;counter++) {
			for(j =1;j<=counter;j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
	}

}
