package methodStudy;

public class NonStaticMethod {

	public static void main(String[] args) {
		NonStaticMethod  n=new NonStaticMethod();
       n.test();
       
       MyClass m=new MyClass();
       
       m.MyMethod();
	}
    public void test() 
    {
    	System.out.println("this is test method ");
    }
}
