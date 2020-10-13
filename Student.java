class Studentm
{
	public static int count=0;
	Studentm(){
		count++;
	}
	private int rno;
	private String sname;
	void setData(int id,String name)
	{
		rno=id;
		sname=name;
	}
	void showData()
	{
		System.out.println("rollnumber is "+rno+" name is "+sname);
	}	
	
}

class Student
{
	public static void main(String args[])
	{
		Studentm s1=new Studentm();
		Studentm s2=new Studentm();
		s1.setData(134,"kanchan");
		s1.showData();
		s2.setData(131,"abcd");
		s2.showData();
		System.out.println("object created in: "+Studentm.count);	
	}

}