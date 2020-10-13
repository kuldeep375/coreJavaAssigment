class Myclass
{
	public int i;
	Myclass()
	{
		System.out.println("Default constructor of Myclass");
	}

	Myclass(int i)
	{
		System.out.println("para constructor of Myclass");
	}
}

class BaseClass extends Myclass
{
	public int j;
	BaseClass()
	{
		super();
		System.out.println("default BaseClass");
	}

	BaseClass(int i,int j)
	{
		super(i);
		System.out.println("para BaseClass");
	}
		
}

class Q47
{
	public static void main(String args[])
	{
		BaseClass b = new BaseClass(41,25);
		BaseClass b1 = new BaseClass();
	}
}
