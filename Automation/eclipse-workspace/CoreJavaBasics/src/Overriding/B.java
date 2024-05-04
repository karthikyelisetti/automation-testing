package Overriding;

/**
 * Condition for Over-riding - Between 2 classes inheritance is must(IS-A)
 * relationship
 * 
 * Both the classes will have same method signature but they differ in
 * implementation(body of the method).
 * 
 * When we create an object for sub class and if we call the common method(which
 * differ in implementation) it always call and execute sub class method & it is
 * known as "Method over-riding".
 * 
 * 
 */

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();
		b.m4();
		b.m5();
		b.m3(); // Overidden method
		b.m4();
		b.m5();
	}
	
	public static void m4() {
		System.out.println("Executing m4() in B");
	}
	
	public static void m5() {
		System.out.println("Executing m5() in B");
	}
	
	public static void m3() {
		System.out.println("Executing m3() in B");
	}

}
