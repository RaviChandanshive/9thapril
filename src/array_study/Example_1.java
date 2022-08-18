package array_study;

public class Example_1 {

	public static void main(String[] args) {
		
		String ar[]=new String[3];
		ar[0]="Ravi";
		ar[1]="Vijay";
		ar[2]="chandanshive";
		
		System.out.println(ar.length);
		
		System.out.println("============");
		
		for(int i=0;i<=0;i++) {
			System.out.println(ar[0]);
		}
		System.out.println("============");
		
		for(int i=0;i<=ar.length-1;i++) {
			System.out.println(ar[i]);
		}
		System.out.println("============");

		for(int i=ar.length-1;i>=0;i--) {
			System.out.println(ar[i]);
		}
	}

}
