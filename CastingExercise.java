package basicOpenLabBook;

public class CastingExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 10;
		int i =b; // will accept - automatic type promotion
		System.out.println(i);
		//byte c = i;  will not accept - because lower type cannot be put in higher
		byte c = (byte)i;
		System.out.println(c);
		byte x = 10;
		byte y =20;
		//byte z = x*y; Error is thrown because when two bytes are used in a
		//arthmetic operation, the result will be integer
		int z = x*y;
		System.out.println(z);
		
	}

}
