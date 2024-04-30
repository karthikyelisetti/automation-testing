package learningMethods;

/**
 * When same method name exists multiple times in the class but differs in the
 * argument then it is known as Method Overloading
 * 
 * Methods with arguments are known as argumented or parameterized methods.
 * 
 * Whenever we have to call any method with an argument then we need to pass
 * respective value to that method then only the method call will get attached
 * with respective method body and will get executed.
 * 
 * Method call gets attached with respective method bodies in the .class file so
 * that during the execution phase, execution happens smoothly, this attachment
 * of method calls with method bodies is known as BINDING / Static Polymohrphism
 * 
 * method overloading is possible with static methods only.
 *
 */

public class Overloading {

	public static void main(String[] args) {

		click();
		click("Mobile link");
		click(10, 20);
	}

	public static void click() {
		System.out.println();
		System.out.println("Running in click()");
	}

	public static void click(String webElement) {
		System.out.println();
		System.out.println("Running in click()");
	}

	public static void click(int xAxis, int yAxis) {
		System.out.println();
		System.out.println("Running in click()");
	}

}
