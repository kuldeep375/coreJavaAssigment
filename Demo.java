import java.util.Scanner;
class MathOperation
{
	static int add(int a,int b)
	{
		return a+b;	
	}

	static int Subtract(int a,int b)
	{
		return a-b;	
	}

	static int multiply(int a,int b)
	{
		return a*b;	
	}
	
	static int power(int a,int b)
	{
		if(b == 0)
			return 1;
		else
			return a * power(a, b  - 1);	
	}
}
class Demo
{
	public static void main(String args[])
	{
		int a,b;
		int resadd,ressub,resmult,respow;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first input: ");
		a=sc.nextInt();
		System.out.println("Enter the second input: ");
		b=sc.nextInt();
		resadd=MathOperation.add(a,b);
		ressub=MathOperation.Subtract(a,b);
		resmult=MathOperation.multiply(a,b);
		respow=MathOperation.power(a,b);
		System.out.println("Addition is "+resadd+" Substraction result is "+ressub+" Multiplication result is: " +resmult+ " power of number is: " +respow);
	}
}