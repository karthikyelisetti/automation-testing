package printStream;

public class GlobalVariable {
	
	static float var = 9.8f;
	int a = 300; // non-static // Instance Variables
	
	// For the global variables, declaration and initialization in single line is
	// must.
	// static char ch; // declaration
	// ch = 30; // Initialization
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m1();

	}
	
	public static void m1() {
		
		// Create an object of the class to access variable "a"
		
		// Classname referencevariable = new ClassName();
		GlobalVariable ref = new GlobalVariable();
		
		//Prints the hashcode or address of the object not the content inside it.
		System.out.println(ref);
		
		System.out.println("var = " + var);
		System.out.println("a = " + ref.a);
		
	}

}
