package controlStatements;

public class Switch_2 {

	public static void main(String[] args) {
		// A---->marks are above 90
        // B---->marks are between 66 and 90
		// C---->marks are between 50 and 66
		// D---->marks are between 40 and 50
		// E---->marks are below 40
		
		char grade='B';
		switch (grade) {
		case 'A':System.out.println("Marks are above 90");
			
			break;
		case 'B':System.out.println("Marks are between 66 and 90");
		break;
		
		case 'C':System.out.println("Marks are between 50 and 66");
		break;
		
		case 'D':System.out.println("Marks are between 40 and 50");
		break;
		
		case 'E':System.out.println("marks are below 40");
		break;
		
		default:System.out.println("Insert the proper grade");
			break;
		}
	}

}
