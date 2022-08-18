package controlStatements;

public class Else_If_statemment {

	public static void main(String[] args) {
		
		String season="Winter";
  
		if (season=="Summer") {
			System.out.println("Its very hot");
		}
		else if (season=="Winter") {
			System.out.println("Its very cold");
		}
		else if (season=="Rainy") {
			System.out.println("Its raning heavily");
		}
		else {
			System.out.println("Invalid Season");
		}
	}

}
