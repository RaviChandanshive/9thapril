package acessSpecifier;

public class PrivateUse {

	public static void main(String[] args) {
		PrivateUse p=new PrivateUse();
		p.test1();
		p.test2();
		p.test3();
		p.test4();

	}
	
	public void test1() {
		System.out.println("this is public Method");
	}
	private void test2() {
		System.out.println("This is Private method");
	}
	void test3() {
		System.out.println("this is default Method");
	}
	protected void test4() {
		System.out.println("this is protected class");
	}

}
