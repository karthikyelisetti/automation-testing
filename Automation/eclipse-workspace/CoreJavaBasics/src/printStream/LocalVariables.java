package printStream;

public class LocalVariables {
	// Global Variables
	static double e;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Local Variables
		
		// Multi-line declaration and initialization
		int number; //declaration
		number = 30; // initialization
		System.out.println("number = " + number); //utilization
		
		//Single line declaration and initialization
		int Number = 37;
		System.out.println("Number = " + Number);
		 
		int NUMBER = 100;
		System.out.println("NUMBER = " + NUMBER);
		 
		double d; // declaration but no initialization for local variable
		//System.out.println("double d " + d);
		//Error: The local variable is not initialized
		 
		// Rule for local Variables - Initialize the local variables with their default
		// values at least because JVM will not provide the default value to it.
	}
	
	public static void m1() {
		System.out.println("e = " + e);
	}

}
