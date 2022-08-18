package constructor;

public class MathOperation {

	int a;
	int b;
	
	public MathOperation() 
	{
		System.out.println("Running user defined constructor ");
		a=50;
		b=30;
	}
	public static void main(String[] args) {
		
	MathOperation mo=new MathOperation();
	mo.add();
	}
	public void add()
	{ int sum=a+b;
	
	System.out.println("the sum is "+sum);
	}

}
