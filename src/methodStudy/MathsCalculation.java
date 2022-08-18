package methodStudy;

public class MathsCalculation {

	public static void main(String[] args) {
		MathsCalculation m=new MathsCalculation();
		m.add();
		sub();
		StaticStudyDifferentClass.sample();

	}
   public void add()
   {
	   int a;
	   int b;
	   int addition;
	   
	   a=10;
	   b=30;
	   addition=a+b;
	   
	   System.out.println("the addition value is "+addition);  
   }
   public static void sub()
   {
	   int a;
	   int b;
	   int subs;
	   a=90;
	   b=20;
	   subs=a-b;
	   System.out.println("the sub value is "+subs);
   }
}
