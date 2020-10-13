class Person
{
	void input()
	{
		System.out.println("hiii");
	}
		
	void show()
	{
		System.out.println("show methos of person");
	}	
}

class Employee extends Person
{
	void myinput()
	{
		System.out.println("hello");
	}

	void show()
	{
		System.out.println("show methos of Employee class");
	}
}

class Q46
{
	public static void main(String args[])
	{
		Person p[]={new Employee(),new Employee(),new Person()};
		for(Person  a : p)
		{
			if(a instanceof Employee)
			{
				Employee e = (Employee) a;
				e.input();
			}
			else
			a.show();
		}
	}
}