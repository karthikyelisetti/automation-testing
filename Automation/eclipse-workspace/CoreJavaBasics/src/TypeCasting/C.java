package TypeCasting;

public class C extends A {

	public static void main(String[] args) {

		C c = new C(); // sub class object
		System.out.println("--------sub class object---------");

		c.m1();
		c.m2(); // over-riding
		c.m3();

		// Up-casting
		A ref = c;
		System.out.println("--------Up-casting---------");
		ref.m1();
		ref.m2();

	}

	public void m2() {
		System.out.println("Running in m2() in class C");
	}

	public void m3() {
		System.out.println("Running in m3() in class C");
	}

}
