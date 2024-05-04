package Inheritance;

/**
 * Inheritance is nothing but acquiring the property of one class in another
 * class.
 * 
 * To create relationship between classes always use "extends" keyword.
 * 
 * The class which exists on the LHS of extends keyword is known as "Sub or
 * child or derived class".
 * 
 * The class which exists on RHS of extends keyword is known as "Super, Parent
 * or Base class".
 * 
 * extends is a keyword which is used to create "IS-A" relationship.
 * 
 * When an object is created for a super class, only non-static members of the
 * super class will get loaded to the object.
 * 
 * When an object is created for a sub class, first super class content will get
 * loaded then sub class content gets loaded to the object of sub class.
 * 
 * Can we inherit static members of the class? -->No, can not inherit static
 * members of a class because it belongs to a particular class and stays in a
 * .class file and do not gets loaded to the object.
 * 
 * Super class can not have access to the sub class content or super class can
 * not inherit sub class because it will create confusion which one is super and
 * which one is sub class.
 *
 */

public class Son extends Father {
	
	int moneyInTheBank = 100000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son s = new Son();
		
		System.out.println("Property of Father = " + s.property);
		s.mansion();
		System.out.println("-----------------------------------------------------------------");
		System.out.println("moneyInTheBank of Son = " + s.moneyInTheBank);
		s.villa();
	}
	
	public void villa() {
		System.out.println("Son has decent size villa");
	}

}
