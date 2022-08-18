package interfaceUse;

public class Son implements Father,Mother{

	public static void main(String[] args) {

		Son s=new Son();
		s.nature();
		s.beauty();
		s.hairstyle();
		s.money();
		s.car();
		s.bike();
		s.love();
		Father.attitude();
		Mother.attitude();
	}

	@Override
	public void nature() {
		System.out.println("Its Mothers Nature");
		
	}

	@Override
	public void beauty() {
	System.out.println("Its Mother Beauty");
		
	}

	@Override
	public void hairstyle() {
		System.out.println("Its Mother Hairstyle");
		
	}

	@Override
	public void money() {
	
		System.out.println("Its Father Money ");
	}

	@Override
	public void car() {
		
		System.out.println("Its Father car");
	}

	@Override
	public void bike() {
		System.out.println("Its Father bike");
		
	}
 
	public void love() {
		Mother.super.love();
		Father.super.love();
	}
}
