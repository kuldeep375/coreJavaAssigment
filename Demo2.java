import java.util.Scanner;
class Faculty
{
	Scanner sc=new Scanner(System.in);
	public int facultyId;
	public int salary;

	Faculty()
	{
		 facultyId=0;
		 salary=1200;
	} 
	Faculty(int facultyId,int salary)
	{
		this.facultyId = facultyId;
		this.salary = salary;
	} 
	
	void input() 
	{
		System.out.println("enter the faculty id");
		this.facultyId=sc.nextInt();
	}
	
	void printSalary()
	{
		System.out.println("Faculty Salary is:" +salary);
	}		
}

class FullTimeFaculty extends Faculty
{
	Scanner sc=new Scanner(System.in);
	public int basicSalary;
	public int allowance;
	
	FullTimeFaculty()
	{
		super();
		basicSalary=0;
		allowance=0;
	}

	FullTimeFaculty(int facultyId,int salary,int basicSalary,int allowance)
	{
		super(facultyId,salary);
		this.basicSalary = basicSalary;
		this.allowance = allowance;
	}

	void input()
	{
		super.input();
		System.out.println("enter the basicSalary and allowance  ");
		basicSalary = sc.nextInt();
		allowance = sc.nextInt();
	}

	void printSalary()
	{
		super.salary = basicSalary + allowance ;  
		super.printSalary();
	}
} 

class PartTimeFaculty extends Faculty  
{
	Scanner sc=new Scanner(System.in);
	public int workingHours;
	public int ratePerHour;
	
	 PartTimeFaculty()
	{
		workingHours = 0;
		ratePerHour = 0;	
	}
	PartTimeFaculty(int workingHours,int ratePerHour)
	{
		this.workingHours = workingHours ;
		this.ratePerHour = ratePerHour;
	}
	
	void input()
	{
		super.input();
		System.out.println("Enter the working hours and rateperhour: ");
		workingHours=sc.nextInt();
		ratePerHour=sc.nextInt();	
	}

	void printSalary()
	{
		super.salary = workingHours * ratePerHour;  
		super.printSalary();	
	} 
		
}
class Demo2
{
	public static void main(String args[])
	{
		 Faculty pv = new PartTimeFaculty();
		pv.input();
		pv. printSalary();
		Faculty fv = new FullTimeFaculty();
		fv.input();
		fv. printSalary(); 	
	}
}