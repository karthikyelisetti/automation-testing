package learningMethods;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methods.m3(); // calling methods within the class ClassName.Method()

	}
	
	public static void m1() {
		System.out.println("Executing m1 ()");
	}
	
	public static void m2() {
		m1();
		System.out.println("Executing m2 ()");
	}
	
	public static void m3() {
		m2();
		System.out.println("Executing m3 ()");
	}

}
