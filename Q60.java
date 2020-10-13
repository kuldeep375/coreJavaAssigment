package sep27;

import java.util.Scanner;

class InvalidFeeException extends Exception
{
	InvalidFeeException(String str)
	{
		super(str);
	}
}
interface StudentFee
{
	void getFee() throws InvalidFeeException;
}

class Student implements StudentFee
{
	private String name;
	private int fees;
	
	Student()
	{
		
	}
	
	Student(String name,int fees)
	{
		this.name=name;
		this.fees=fees;
	}

	@Override
	public void getFee() throws InvalidFeeException {
		System.out.println("enter the student name");
		Scanner sc=new Scanner(System.in);
		this.name=sc.next();
		System.out.println("enter the student fees");
		this.fees=sc.nextInt();
		if(fees<0)
			throw new InvalidFeeException("Sorry fee is invalid...");	
	}

	@Override
	public String toString() {
		return "name=" + name + " fees=" + fees ;
	}
	
	
}
public class Q60 {

	public static void main(String[] args) {
		Student st = new Student();
		try {
			st.getFee();
			System.out.println(st);
		}
		catch(Exception e)
		{
			System.out.println("error occured "+e);
		}
		
	}

}
