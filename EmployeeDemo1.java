class Employee
{
	private static int empNo=0;
	private static int salary=0;
	private  static int totalSalary=0;
	static int count=0;
	
	Employee(int salary)
	{
		empNo++;
		this.salary=salary;
		totalSalary+=salary;
		count++;
	}
	void show()
	{
		totalSalary=this.totalSalary+salary;
		System.out.println("total employees are: "+count+ " Total salary is "+totalSalary);
	}
	void disp()
	{
		System.out.println(" empno "+empNo+ " salary is: "+salary);
	}
}

class EmployeeDemo1
{
	public static void main(String args[])
	{
		Employee e=new Employee(23000);
		e.disp();
		Employee e1=new Employee(12000);
		e1.disp();
		Employee e2=new Employee(258777);
		e2.disp();
		Employee e3=new Employee(325000);
		e3.disp();
		e.show();
	}
} 