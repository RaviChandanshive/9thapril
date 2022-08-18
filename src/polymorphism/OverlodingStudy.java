package polymorphism;

public class OverlodingStudy {

	public static void main(String[] args) {
		OverlodingStudy os=new OverlodingStudy();
		os.add();
		os.add(24);
		os.add(14, 37);

	}

	public void add(){
		int a=20;
		int b=30;
		int sum=a+b;
		System.out.println("the value of sum is "+sum);
	}
	
	public void add(int a) {
		int sum=a+45;
		System.out.println("the value of sum is "+sum);
	}
	
	public void add(int a,int b) {
		int sum=a+b+54;
		System.out.println("the value of sum is "+sum);
	}
}
