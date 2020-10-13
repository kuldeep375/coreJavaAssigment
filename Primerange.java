import java.util.Scanner;
class Primerange
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int fnum=sc.nextInt();	
		System.out.println("Enter second number:");
		int lnum=sc.nextInt();
		System.out.println("prime no between " +fnum+" and "+lnum+ " are:");
		int count;
		for(int i=fnum;i<=lnum;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i % j == 0)
				count++;
				else
				continue;
			}
			if(count==2)
			System.out.println(i);
		}
		
	}
}