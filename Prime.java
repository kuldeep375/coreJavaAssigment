import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if(num==0 || num==1 || num==2)
		{
			System.out.println("invalid input");
		}
		else
		{
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
		}
		if(count>1)
		{
			System.out.println("it is not a prime number");
		}
		else
		{
			System.out.println("it is a prime number");
		}
	}
}