import java.util.*;  
class Percent
{
	public static void main(String args[])
	{
		int sum;
		int tot=500;
		int per;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		int m5=sc.nextInt();
		sum=(m1+m2+m3+m4+m5);
		per=((sum*100)/tot);
		System.out.println("percentage marks = "+per+" %");
	}
}