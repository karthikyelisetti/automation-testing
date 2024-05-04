package TypeCasting;

public class B extends A {

	public static void main(String[] args) {

		B b = new B();
		System.out.println("------------Sub Class Object --------");
		b.m1();
		b.m2();
		b.m3();
		b.m4();

		A ref = (A) b; // Up-Casting
		System.out.println("------------ After Upcasting --------");

		ref.m1();
		ref.m2();

		System.out.println("------------After Down Casting --------");

		B obj = (B) ref; // Down Casting
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();

	}

	public void m3() {
		System.out.println("Running in m3()");
	}

	public void m4() {
		System.out.println("Running in m4()");
	}
}
