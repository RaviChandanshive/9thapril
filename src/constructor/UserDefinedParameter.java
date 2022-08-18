package constructor;

public class UserDefinedParameter
    {  int a;
       int b;
       int c;
     public UserDefinedParameter()
     { a=20;
       b=30;
       c=45;	 
     }
  public UserDefinedParameter(int x) 
  {
	  a=x;
  }
  public UserDefinedParameter(int x,int y) 
  {
	  a=x;
	  b=y;
  }
  public UserDefinedParameter(int x, int y, int z) 
  {
	  a=x;
	 b=y;
	 c=z;
  }
	public static void main(String[] args) {
      UserDefinedParameter u=new UserDefinedParameter();
        u.addition();
      UserDefinedParameter u1=new UserDefinedParameter(23);
      u1.addition();
      UserDefinedParameter u2=new UserDefinedParameter(33, 25);
      u2.addition();
      UserDefinedParameter u3= new UserDefinedParameter(20, 20, 20);
      u3.addition();
	}
  public void addition()
  {
	  int sum=a+b+c;
	  System.out.println("the value of sum is "+sum);
  }
}
