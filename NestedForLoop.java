package basicOpenLabBook;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =0;i<=3;i++) {
			for(int j = 0;j<=3;j++) {
				System.out.println(i+" "+j);
			}
		}
		for(int x=0;x<=4;x++) {
			for(int z =0;z<=4;z++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
