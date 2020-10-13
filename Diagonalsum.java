import java.util.Scanner;
class Diagonalsum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		int sum=0;
		int a[]=new int[3];
		int b[]=new int[3];
		int c[]=new int[3];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		System.out.println("Enter the elemets:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array elements are:");
		for(int a1[] : arr)
		{
			for(int b1 : a1)
			{
				System.out.print("  "+b1);
			}
		System.out.println(" ");
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==j)
				sum+=arr[i][j];
			}
		}
		System.out.println("sum of diagonal elements is:"+sum);
	}
}