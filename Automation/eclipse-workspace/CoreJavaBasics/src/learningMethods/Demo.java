package learningMethods;

/**
 * What is Constructor -
 * 
 * constructor is nothing but a special type of method which holds the name of
 * the class itself.
 * 
 * It will not have return type, otherwise it will become non-static method
 * 
 * It does not have any modifier -> static keyword
 * 
 * But constructor will have access specifiers
 * 
 * When an object is created for a class automatically constructor will get
 * called and executed.
 * 
 * If user is not defining a constructor in a class then, compiler will
 * automatically generate a default constructor without anything in the body and
 * also without an argument.
 *
 */

public class Demo {
	
	public Demo() {
		System.out.println("Running in Demo() Constructor");
	}

	public static void main(String[] args) {

		Demo ref = new Demo(); //--> call to constructor 
	}

}
