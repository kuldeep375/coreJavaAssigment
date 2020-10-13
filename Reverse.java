import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number you want to reverse:");
		int num=sc.nextInt();
		System.out.println("reverse number:");
		while(num!=0)
		{
			System.out.print(num%10);
			num=num/10;
		}	
	}
}