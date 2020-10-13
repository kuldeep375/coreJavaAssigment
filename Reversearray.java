import java.util.Scanner;
class Reversearray
{
	public static void main(String args[])
	{
		int temp;
		int num[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();	
		}
		System.out.println("Reverse order of array:");
		for(int i=4;i>=0;i--)
		{
			System.out.println(num[i]+" ");
		}
	}
}
