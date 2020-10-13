import java.util.Scanner;
class Gendercheck
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person gender:");
		char gen=sc.next().charAt(0);
		System.out.println("Enter person age:");
		int age=sc.nextInt();
		if(gen=='M' && age>=22)
		{
			System.out.println("you are Eligible for marriage");
		}

		else if(gen=='F' && age>=18)
		{
			System.out.println("you are  Eligible for marriage");
		}
		else
		{
			System.out.println("you are not Eligible for marriage");
		}	
	}
}