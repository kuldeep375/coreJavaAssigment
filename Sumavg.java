import java.util.Scanner;
class Sumavg
{
	public static void main(String args[])
	{
		int sum=0;
		double avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 10 number:");
		for(int i=0;i<10;i++)
		{
			int num=sc.nextInt();
			sum+=num;
		}
		System.out.println("sum of number is:"+sum);
		avg=sum/10;
		System.out.println("avg of number is:"+avg);	
	}
}