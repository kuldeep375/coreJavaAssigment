import java.util.Scanner;
class Student
{
	public int rollno;
	public float percentage;

	Student()
	{
		rollno = 0;
		percentage = 0.0f;
	}

	Student(int rollno, float percentage)
	{
		this.rollno = rollno;
		this.percentage = percentage;
	}
	
	void show()
	{
		System.out.println(rollno+ "  " +percentage);
	}
}

class CollegeStudent extends Student
{
	public int semester;
	CollegeStudent()
	{
		super();
		semester = 0;	
	}

	CollegeStudent(int rollno, float percentage,int semester)
	{
		super(rollno,percentage);
		this.semester = semester;
	}
	
	void show()
	{
		super.show() ;
		System.out.println( " "+semester);
	}
} 

class SchoolStudent extends Student 
{
	public int className; 
	SchoolStudent()
	{
		className = 0;
	}

	SchoolStudent(int rollno, float percentage,int className)
	{
		super(rollno,percentage);
		this.className = className;
	}
	void show()
	{
		super.show();
		System.out.println( " "+className);
	}
}  
class Studentdemo1
{
	public static void main(String args[])
	{
		int flags=0;
		int flagc=0;
		int count=0;
		Scanner sc = new Scanner(System.in);
		CollegeStudent  cs[] = new CollegeStudent[2];
		SchoolStudent ss[] = new SchoolStudent [3];
		System.out.println("Enter collge student details:");
		for(int i=0;i<cs.length;i++)
		{
			System.out.println("Enter the roll number: ");
			int rollno=sc.nextInt();
			System.out.println("Enter the Percentage: ");
			float percentage=sc.nextFloat();
			System.out.println("Enter the Semester: ");
			int semester=sc.nextInt();
			CollegeStudent c = new CollegeStudent(rollno,percentage,semester);
			cs[i] = c;
		}
		System.out.println("Enter School Student details:");
		for(int i=0;i<ss.length;i++)
		{
			System.out.println("Enter the roll number: ");
			int rollno=sc.nextInt();
			System.out.println("Enter the Percentage: ");
			float percentage=sc.nextFloat();
			System.out.println("Enter the className: ");
			int className=sc.nextInt();
			SchoolStudent  c1 = new SchoolStudent (rollno,percentage,className);
			ss[i] = c1;
		}
		System.out.println("college student are:");
		for(CollegeStudent s : cs)
		{
			s.show();
		}
		System.out.println(" School student are:");
		for(SchoolStudent  s1 : ss)
		{
			s1.show();
		}

		System.out.println("enter the roll no to search:" );
		int rollno=sc.nextInt();
		for(CollegeStudent a : cs)
		{
			if(rollno == a.rollno)
			flagc=1;	
		}
		for(SchoolStudent b : ss)
		{
			if(rollno == b.rollno)
			flags=1;	
		}
		for(CollegeStudent d : cs)
		{
			if(d.percentage > 75)
			count++;	
		}
		
		for(SchoolStudent e : ss)
		{
			if(e.percentage > 75)
			count++;	
		}
		
		if(flagc == 1)
		System.out.println("student is Collgestudent");	
		if(flags == 1)
		System.out.println("student is SchoolStudent");	
		System.out.println(count+" Students having A grade");
			
	}
		
}

