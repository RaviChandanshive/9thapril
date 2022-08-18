package array_study;

public class Example_2 {

	public static void main(String[] args) {
//	int rollNum[]=new int[3];
	
	int rollNum1[]= {1,2,3,4,5,6};
	char grade[]= {'A','B','C','D'};
	
	System.out.println(rollNum1[3]);
	System.out.println("============");
	for(int i=0;i<=rollNum1.length-1;i++) {
		System.out.println(rollNum1[i]);
	}
	System.out.println("============");

	for(char i=0;i<=3;i++) {
		System.out.println(grade[i]);
	}
	}

}
