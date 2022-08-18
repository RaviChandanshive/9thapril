package variableTypes;

public class GlobalAndLocalVariable {
	
	int a=20;
	static int b=30;


	public static void main(String[] args) {
	GlobalAndLocalVariable g=new GlobalAndLocalVariable();
	g.test();
	test1();
	System.out.println("the global value of a "+g.a);
    System.out.println("the static variable value of b is "+b);
    Sample s=new Sample();
    System.out.println("the addition value from different class is "+s.addition);
	}
  public void test()
  { int a=40;
    int sum=a+60;
    System.out.println("the value of sum "+sum);
      }
  
  public static void test1() 
  {  int a=10;
     int d=80;
     int addition=a+d;
  System.out.println("the static test 1 a value of addition is "+addition);
	  
  }
}
  
