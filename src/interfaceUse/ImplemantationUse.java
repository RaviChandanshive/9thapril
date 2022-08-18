package interfaceUse;

public class ImplemantationUse implements InterfaceStudy {

	public static void main(String[] args) {
         ImplemantationUse iu=new ImplemantationUse();
         iu.name();
         iu.age();
         iu.weight();
         iu.height();
         
	}

	@Override
	public void name() {
		System.out.println("my name is ravi");
		
	}

	@Override
	public void age() {
		System.out.println("My age is 24 year ");
		
	}

	@Override
	public void weight() {
		System.out.println("my weight is 62kg ");
		
	}

	@Override
	public void height() {
   System.out.println("my height is 164 cm");
		
	}

}
