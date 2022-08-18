package keywords;

public class ThisUse {

	int a=200;
	int b=350;
	
	public static void main(String[] args) {
	ThisUse t=new ThisUse();
	t.sample();

	}

	
	public void sample() {
		int a=150;
		int b=45;
		int sum=a+132;
		
		int add=b+123;
		System.out.println("the value of sum is "+sum);
		System.out.println("the value of add is "+add);
		
		System.out.println("================");
		
		int sum1=this.a+223;
		int sub=this.b-147;
		System.out.println("the value of sum1 is "+sum1);
		System.out.println("the value of sub is "+sub);
	}
}
