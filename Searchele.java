import java.util.Scanner;
class Searchele
{
	public static void main(String args[])
	{
		int temp;
		int flag=0;
		int pos=0;
		int num[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();	
		}
		System.out.println("Enter the element you want to search:");
		int ele=sc.nextInt();
		outer:
		for(int i=0;i<num.length;i++)
		{
			if(ele==num[i])
			{
				pos=i+1;
				flag=1;
				break outer;
			}
		}
		if(flag==1)
		{
			System.out.println("Element is found at "+pos);
		}
		else
		{
			System.out.println("element is not found");
		}
	}
}
