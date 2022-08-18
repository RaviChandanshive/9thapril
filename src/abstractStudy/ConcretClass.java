package abstractStudy;

public class ConcretClass extends AbstractUse{

	public static void main(String[] args) {
		ConcretClass c=new ConcretClass();
		c.height();
		c.hobbies();
		c.name();
		c.weight();

	}

	@Override
	public void weight() {
		System.out.println("my weight is 65kg");
		
	}

	@Override
	public void height() {
		System.out.println("my height is 164cm");
		
	}

	@Override
	public void hobbies() {
		System.out.println("my hobbies is making poem");
		
	}

}
