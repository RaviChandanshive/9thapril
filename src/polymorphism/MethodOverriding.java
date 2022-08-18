package polymorphism;

public class MethodOverriding extends RaviInfo{

	public static void main(String[] args) {
		RaviInfo r=new RaviInfo();
		MethodOverriding mo=new MethodOverriding();
		r.name();
		mo.name();
		

	}
    public void name() {
    	System.out.println("my nickname is Saudagar");
    }
}
