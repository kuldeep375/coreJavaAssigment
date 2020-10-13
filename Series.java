import java.util.Scanner;
class Series
{
	public static void main(String args[])
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		int fnum=sc.nextInt();
		System.out.println("enter last number:");
		int lnum=sc.nextInt();
		System.out.println("Series are:");
		for(int i=fnum;i<=lnum;i+=10)
		{
			System.out.println(i);
			sum+=i;	
		}
		System.out.println("Total sum="+sum);
	}
}