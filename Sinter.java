import java.util.Scanner;
class Sinter
{
	public static void main(String args[])
	{
		int si;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle:");
		int pr=sc.nextInt();
		System.out.println("Enter the rate:");
		int rate=sc.nextInt();
		System.out.println("Enter the time(in year):");
		int yr=sc.nextInt();
		si=((pr*rate*yr)/100);
		System.out.println("Simple interest is: "+si);	
	}
}