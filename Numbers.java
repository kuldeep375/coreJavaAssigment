import java.util.Scanner;
class Numbers
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b)
		{
			if(a>c)	
			{
				System.out.println("greatest number is:"+a);	
			}
			else
			{
				System.out.println("greatest number is:"+c);	
			}
		}
		else if(b>c)
		{
			if(b>a)	
			{
				System.out.println("greatest number is:"+b);	
			}
			else
			{
				System.out.println("greatest number is:"+a);	
			}
		} 
		else
		{
			System.out.println("greatest number is:"+c);
		}
		
	}
}