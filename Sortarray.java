import java.util.Scanner;
class Sortarray
{
	public static void main(String args[])
	{
		int temp;
		int num[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();	
		}
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]<num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Descending order:");
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]+" ");
		}
	}
}
