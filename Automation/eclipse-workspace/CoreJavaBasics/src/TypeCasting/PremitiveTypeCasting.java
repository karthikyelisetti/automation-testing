package TypeCasting;

public class PremitiveTypeCasting {

	public static void main(String[] args) {

		// implicit conversion - widening of the spaces
		byte a = 30;
		double b = a;
		System.out.println("Value of byte a = " + a);
		System.out.println("Value of double b = " + b);

		// implicit conversion - widening of the spaces
		char c = 'A';
		int d = c;
		System.out.println("Value of char c = " + c);
		System.out.println("Value of int d = " + d);

		// Explicit conversion - narrowing of the spaces

		double e = 86.29;
		int f = (int) e;
		// Error: Possible loss of conversion
		System.out.println("Value of double e = " + e);
		System.out.println("Value of int f = " + f);

		int g = 72;
		char h = (char) g;
		System.out.println("Value of int g = " + g);
		System.out.println("Value of char h = " + h);

	}

}
