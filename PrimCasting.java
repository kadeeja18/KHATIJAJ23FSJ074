package closedLabBook;

public class PrimCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		char c = 'a';
		boolean b = false;
		byte bi = 1;
		short s = 2;
		long l = 123456;
		double d = 12.0;
		float f = 13.0f;
		String st = "New age";
		System.out.println("Down casting");

		System.out.println(l);
		System.out.println("Assigning a byte to short");
		s = bi;
		System.out.println(s);
		System.out.println("Assigning a short to int");
		i = s;
		System.out.println(i);
		System.out.println("Assigning int to long");
		l = i;
		System.out.println("Assigning long to float");
		f=l;
		System.out.println("Assigning a float to double");
		d = f;
		System.out.println(d);
		System.out.println("************");
		System.out.println("Reassiggning the older values");
		System.out.println("************");
		 i = 10;
		 c = 'a';
		 b = false;
		 bi = 1;
		 s = 2;
		 l = 123456;
		 d = 12.0;
		 f = 13.0f;
			System.out.println("UP casting");

		 System.out.println("Assigning a double to float");
		 f=(float)d;
		 System.out.println(f);
		 System.out.println("Assigning a float to long ");
		 l =(long)f;
		 System.out.println(l);
		 System.out.println("Assigning a long to int");
		 i = (int)l;
		 System.out.println(i);
		 System.out.println("Assiging an int to short");
		 s=(short)i;
		 System.out.println("Assigning a short to byte");
		 bi=(byte)s;
		 System.out.println("*********************");
		System.out.println("Assigning char to String");
		st = Character.toString(c);
		System.out.println(st);
		System.out.println("Assigning Boolean to String");
		st = Boolean.toString(b);
		System.out.println(st);
		st = "true";
		System.out.println("Convert string to Boolean ");
		System.out.println("The vaue of boolean before converting " + b);
		b = Boolean.parseBoolean(st);
		System.out.println("The vaue of boolean after converting " + b);

		System.out.println(l);
	}

}
