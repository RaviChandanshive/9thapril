package inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {

		Son s=new Son();
		s.recepies();
		s.look();
		s.mobile();
		
		System.out.println("============");
		
		
		Son.stories();
		Son.Nature();
		Son.laptop();

	}

}



