class Person
{
	private int Page;
	private String Name;
	Person()
	{
		Page=18;
		Name="kanchan";	
	}
	Person(int Page,String Name)
	{
		this.Page=Page;
		this.Name=Name;
	}
	void Display()
	{
		System.out.println(" person age is: "+Page+ " Person Name is: " +Name);
	}
}


class PersonDemo
{
	public static void main(String args[])
	{
		Person p=new Person();
		p.Display();
		Person p1=new Person(101,"abc");
		p1.Display();	
	}
}