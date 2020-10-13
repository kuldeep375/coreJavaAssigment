import java.util.Scanner;
class Sumrow
{
	public static void main(String args[])
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[5][];
		int a[]=new int[5];
		int b[]=new int[4];
		int c[]=new int[3];
		int d[]=new int[2];
		int e[]=new int[3];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		arr[3]=d;
		arr[4]=e;
		System.out.println("enter the elements:");
		for(int i=0;i<arr.length;i++)	
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}	
		}
		System.out.println("Array elements are:");
		for(int ar[] : arr)
		{
			for(int y: ar)
			{
				System.out.print(" "+y);
				sum+=y;
			}
			System.out.println(" ");
		}
		System.out.println("total sum of number is:"+sum);
	}
}