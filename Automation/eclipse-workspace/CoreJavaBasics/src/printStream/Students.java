package printStream;

public class Students {
	
	//Static variables are class level changes, hence once changed they will remain as it is.
	static String schoolName = "Siddhartha Residential School";
	String name;
	int rollNumber;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students dtls = new Students();
		
		dtls.name = "Sri Aadvika";
		dtls.rollNumber = 25;
		// static variables are the class level variables, hence once changed they
		// will remain as it is.
		schoolName = "Jubilee Hills Public School";
		dtls.s1();
		
		System.out.println("------------------------------------------");
		
		Students dtls1 = new Students();
		dtls1.name = "Swathi";
		dtls1.rollNumber = 34;
		dtls1.s1();
		
		System.out.println("------------------------------------------");
		
		Students dtls2 = new Students();
		dtls2.name = "Karthik";
		dtls2.rollNumber = 37;
		dtls2.s1();

	}
	
	public void s1() {
		
		System.out.println("Name = " + name);
		System.out.println("Roll Number = " + rollNumber);
		System.out.println("School = " + schoolName);
	}

}
