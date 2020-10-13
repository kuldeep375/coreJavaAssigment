import java.util.Scanner;
abstract class Processor 
{
	public double data;
	public final float PI=3.14f;
	void showData()
	{
		System.out.println("data value is: "+ data);
	}
	abstract void process();
	
}

class Factorial extends Processor  
{
	
	Scanner sc = new Scanner(System.in);
	void process()
	{

		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		for(int i =1;i<=num;i++)
		data = num*i;
		System.out.println("factorial of a number is: "+data);	
	}
}

class  Circle extends Processor  
{
	Scanner sc = new Scanner(System.in);
	void process()
	{
		System.out.println("Enter the radius: ");
		int rad = sc.nextInt();
		data = PI * rad * rad;
		System.out.println("factorial of a number is: "+data);	
	}
}

class Q48
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Enter the choice : 1. Factorial of number 2. Area of Circle ");
		choice = sc.nextInt();
		if(choice == 1)
		{
			Processor  p = new Factorial();
			p.process();
		}
		else
		{
			Processor  c = new Circle();
			c.process();
		}
		
	}
}