import java .util.Scanner;

class Days
{
	public static void main(String args[])
	{
		int day;
		int year;
		int month;
		System.out.println("Enter the days: ");
		Scanner sc=new Scanner(System.in);
		day=sc.nextInt();
		year=day/365;
		day=day%365;
		System.out.println("Year=" +year);
		month=day/30;
		day=day%30;
		System.out.println("Month=" +month);
		System.out.println("Days="+day);	
		
	}
}