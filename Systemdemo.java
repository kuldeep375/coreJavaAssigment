class System1
{
	public int id;
	public String Name;
	public int marks;
	
	System1(int id,String Name)
	{
		this.id=id;
		this.Name=Name;
	}

	System1(int marks)
	{	
		this(125,"kanchan");
		this.marks=marks;
	}
	void show()
	{
		System.out.println(id+" "+Name+" "+marks);
	}
}

class SystemDemo
{
	public static void main(String args[])
	{
		System1 sr=new System1(345);
		sr.show();
	}
}