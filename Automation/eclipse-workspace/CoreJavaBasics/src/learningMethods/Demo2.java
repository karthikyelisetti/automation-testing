package learningMethods;

/**
 * When multiple constructors exists in the same class but differs in the
 * Argument then it is called as Argumented Constructor or Constructor
 * Overloading
 * 
 * @author Rakesh
 *
 */

public class Demo2 {

	public Demo2(int age) {
		System.out.println("age = " + age);
		System.out.println("Running in int argumented constructor");
	}

	public Demo2(String name) {
		System.out.println("name = " + name);
		System.out.println("Running in String argumented constructor");
	}

	public Demo2() {
		System.out.println("Running in zero argumented constructor");
	}

	public static void main(String[] args) {

		// Call to constructors
		Demo2 obj1 = new Demo2();
		Demo2 obj2 = new Demo2(32);
		Demo2 obj3 = new Demo2("Rakesh Kumar Singh");
	}

}
