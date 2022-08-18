package loopStudy;

public class ForLoop {

	public static void main(String[] args) {
		
		for (int a=2 ;a<=20 ; a=a+2) {
			
			System.out.println(a);
		}
		System.out.println("=============");
       for (int a=1 ;a<=20;a=a+2) {
    	   int sum=a+1;
    	   int div=1+a/2;
    	   System.out.println("2x"+div+"="+sum);
       }
	}

}
