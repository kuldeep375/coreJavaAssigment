import java.util.Scanner;
class FindMaxMin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("enter the elemets:");
		for(int i=0;i<arr.length;i++)
		arr[i]=sc.nextInt();
		System.out.println("Elements are:");
		int max=-9999;
		int min=9999;
		for(int a: arr)
		{
			if(max < a)
			{		
				max=a;
			}
			if(min > a)
			{		
				min=a;
			}
		}
		System.out.println("smallest  number is:"+min);
		System.out.println("greatest number is:"+max);
		
	}
}