package basicOpenLabBook;

public class PyramidExampleReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i>=0;i--) {
			for(int j =0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		int term=6;
		for(int k=1;k<=term;k++)
		{
		for(int l=term;l>=k;l--)
		{
		System.out.print("* ");
		}
		System.out.println();//new line
		}
	}

}
