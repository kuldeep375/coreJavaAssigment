class Employee
{
	private int	 Eid;
	private String Name;
	private String Surname;	
	
	Employee()
	{
		Eid=100;
		Name="abc";
		Surname="nnnn";
	}
	
	Employee(int Eid,String Name,String Surname)
	{
		this.Eid=Eid;
		this.Name=Name;
		this.Surname=Surname;
	}
	void show()
	{
		System.out.println(" Eid is: "+Eid+" Name is "+Name+" Surname is: "+Surname);
	}
}
class Employeedemo
{
	public static void main(String args[])
	{
		Employee e=new Employee();
		e.show();
		Employee e1=new Employee(101,"misskanchan","sali");
		e1.show();
		
	}
}