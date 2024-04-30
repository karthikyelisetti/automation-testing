package Inheritance;

public class Father {
	
	String property = "1 Million Dollars";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Father f = new Father();
		System.out.println("Property of the Father = " + f.property);
		f.mansion();
	}
	
	public void mansion() {
		System.out.println("Father has a beautiful Mansion");
	}

}
