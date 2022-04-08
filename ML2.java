package Inheritance;

public class ML2 extends ML1{

	public void cond()
	{
	 int a=60;
	 int b=90;
	 int c=100;
	 int d= 75;
	 int e=85;
	 float percentage=a+b+c+d+e*100/500f;
	 
	 if (percentage<=40)
	 {
		 System.out.println("student is just passed closely or he is in 3 class");
	 }
	 else if (percentage<=50)
	 {
		 System.out.println("The student is in second class ");
		 
	 }
	 else if (percentage>=75)
	 {
		 System.out.println("The student is in first class or distinction ");
		 
	 }
	 else 
	 {
		 System.out.println("student is failed ");
	 }
	}
	
	public void check()
	{
		System.out.println("this is the second level ");
	}
}
