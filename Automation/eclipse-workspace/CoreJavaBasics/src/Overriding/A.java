package Overriding;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		a.m1();
		a.m2();
		a.m3();
	}
	
	public static void m1() {
		System.out.println("Executing m1 () in A");
	}
	
	public static void m2() {
		System.out.println("Executing m2 () in A");
	}
	
	public static void m3() {
		System.out.println("Executing m3 () in A");
	}
}
