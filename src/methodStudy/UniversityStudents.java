package methodStudy;

public class UniversityStudents {

	public static void main(String[] args) {
		UniversityStudents us=new UniversityStudents();
		us.studentInfo();
		us.studentInfo("Ram", "PU12456", "arts", "economics", 'M', 2019, 65.4f);

	}
   public void studentInfo()
   {
	   String name;
	   name="solapur";
	   
	   String PRN;
	   PRN="SU1234";
	   
	   String branch;
	   branch="science";
	   
	   String dept;
	   dept="Chemistry";
	   
	   char gender;
	   gender='M';
	   
	   int passoutyear;
	   passoutyear=2020;
	   
	   float weight;
	   weight=69.8f;
	   
	   System.out.println("========================");
	   System.out.println("my name is "+name);
	   System.out.println("my PRN number is "+PRN);
	   System.out.println("my branch is "+branch);
	   System.out.println("my dept is "+dept);
	   System.out.println("my gender is "+gender);
	   System.out.println("my Pass Out Year "+passoutyear);
	   System.out.println("my weight is "+weight);
	   System.out.println("==========================");
   }
   public void studentInfo(String name, String PRN, String branch, String dept, char gender, int passoutyear, float weight)
   {
	   System.out.println("========================");
	   System.out.println("my name is "+name);
	   System.out.println("my PRN number is "+PRN);
	   System.out.println("my branch is "+branch);
	   System.out.println("my dept is "+dept);
	   System.out.println("my gender is "+gender);
	   System.out.println("my Pass Out Year "+passoutyear);
	   System.out.println("my weight is "+weight);
	   System.out.println("==========================");
   }
	   
   }

