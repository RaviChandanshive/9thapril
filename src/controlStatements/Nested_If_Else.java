package controlStatements;

public class Nested_If_Else {

	public static void main(String[] args) {
		
		String UN="Ravi";
		String PASS="Ravi@123";

		if (UN=="Ravi") {
			System.out.println("valid UN Please ,enter password");
			
			if (PASS=="Ravi@123") {
				System.out.println("valid password ,login successfull");
			}
			else {
				System.out.println("Invalid password ,check password");
			}
		} else {
         System.out.println("Invalid UN , check UN");
		}
	}

}
