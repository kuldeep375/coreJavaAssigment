import java.util.Scanner;
class Evenodd
{
	public static void main(String args[])
	{
		int sum=0;
		int osum=0;
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the elements:");
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]%2==0)
			{
				sum+=arr[j];
			}
			else
			{
				osum+=arr[j];
			}
		}
		System.out.println("even elements sum is:"+sum);
		System.out.println("odd elemets are sum is:"+osum);	
	}
}