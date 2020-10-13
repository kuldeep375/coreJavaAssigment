

package sep27;

import java.util.Scanner;

class Employee
{
	int empId;
	String name;
	int salary;
	Employee()
	{
		empId=0;
		name = null;
		salary = 0;
	}
	
	Employee(int empId,String name,int salary)
	{
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return empId+ " " +name+ " "+salary;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(obj instanceof Employee)
		{
			Employee emp = (Employee)obj;
			return empId == emp.empId;
		}
		return false;
	}
}
public class Xyz extends Employee  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp[] = new Employee[5];
		System.out.println("Enter the details: ");
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the EmpId:");
			int empId = sc.nextInt();
			System.out.println("Enter the name of Employee: ");
			String name = sc.next();
			System.out.println("Enter the salary of employee: ");
			int salary = sc.nextInt();
			Employee e = new Employee(empId,name,salary);
				
				if(emp[0].equals(emp[i]))
				{
					System.out.println("Id is alredy exist please enter enother id"+i);
					
				}
				emp[i] = e;
		}
		
		for(Employee e1:emp)
		{
			System.out.println(e1);
		}
		sc.close();
	}

}
