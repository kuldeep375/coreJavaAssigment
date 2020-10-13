import java.util.Scanner;
class twodarray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[2][];
		int a[]=new int[3];
		int b[]=new int[4];
		arr[0]=a;
		arr[1]=b;
		System.out.println("Enter the Elements:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int count=0;
		System.out.println("Elemets are:");
		for(int ar[] : arr)
		{
			count++;
			int tcount=0;
			for(int a1: ar)
			{
				System.out.print(" "+a1);
				tcount++;	
			}
			System.out.println("");
			System.out.println("total count of this array is:"+tcount);
		}
		System.out.println("count of 1d array is:"+count);		
	}
}