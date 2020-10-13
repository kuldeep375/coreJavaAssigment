package sep27;

import java.util.Scanner;

class Voter extends Exception
{
	Voter()
	{
		super("Sorry.....invalid age for voter !!!!");
	}
}
public class Q59 {
	static void checkAge(int age) throws Voter
	{
		if(age>18)
		{
			System.out.println("eligible for vote");
		}
		else
		{
			throw new Voter();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int ae=sc.nextInt();
		try
		{
			checkAge(ae);
		}
		catch(Voter v)
		{
			System.out.println(v);
		}
			sc.close();
	}

}
