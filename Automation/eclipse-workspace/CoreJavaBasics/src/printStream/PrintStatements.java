	package printStream;

public class PrintStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Good Morning!");
		System.out.println("Welcome to the Class!");

		// Arthematic operation
		System.out.println(10.5 + 2);

		// Concatination
		System.out.println("10" + "2");

		// Single quotation lower case alphabets are considered as ascii characters when
		// used along with arthematic operation
		System.out.println('c' + 0);
		
		// concatination with string and number will combine both the texts
		System.out.println("My age is " + 30);
		
		//Left --> Right and two inputs at a time
		System.out.println("My age is " + 10 + 5 + 7 + 8);
		
		//BODMAS rule B – Brackets, O – Order of powers or roots, D – Division, M – Multiplication A – Addition, and S – Subtraction
		System.out.println("My experience is " + (1 + 8 + 3.5));

		System.out.println("Inherit the global variable = " + LocalVariables.e);
	}

}
