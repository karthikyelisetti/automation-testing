package Inheritance;

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
