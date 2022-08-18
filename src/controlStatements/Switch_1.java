package controlStatements;

public class Switch_1 {

	public static void main(String[] args) {
		String Day="Wednesday";
		switch (Day) {
		case "Monday":System.out.println("this is 1st day of week");
		
			break;

		case "Tuesday":System.out.println("this is 2nd day of week");
		
			break;
		case "Wednesday":System.out.println("this is 3rd day of week");
		   break;
		   
		case "Thursday":System.out.println("this is 4th day of week");
		break;
		
		case "Friday":System.out.println("this is 5th day of week");
		break;
		
		case"saturday":System.out.println("this is 6th day of week");
		break;
		
		case"sunday":System.out.println("this is 7th day of week");
		break;
		
		default:System.out.println("Insert the valid day");
		break;
		}
	}

}
