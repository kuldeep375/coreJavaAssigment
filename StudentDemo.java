import java.util.Scanner;
class Student
{
	public String Name;
	public int Rollno;
	public int Age;
	public int Score;
	Student(String Name,int Rollno,int Age,int Score)
	{
		this.Name = Name;
		this.Rollno = Rollno;
		this.Age = Age;
		this.Score=Score;
	}

	public int getScore()
	{
		return Score;
	}

	void show()
	{
		 System.out.println(Name+ " " +Rollno+ " " +Age+ " " +Score);
	}	
}
class StudentDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Student s[] = new Student[10];
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter the student Details: " +(i+1));
			String Name=sc.next();
			int Rollno=sc.nextInt();
			int Age=sc.nextInt();
			int Score=sc.nextInt();	
			Student sr=new Student(Name,Rollno,Age,Score);
			s[i]=sr;
		}
		System.out.println("Student score between 0-50");
		 for( Student a : s)
		{
            			if(a.getScore()>0  &&  a.getScore()<50)
			{
				a.show();
			}
			
        		}

		System.out.println("Student score between 65-80");
		 for( Student a : s)
		{
            			if(a.getScore()>65  &&  a.getScore()<80)
			{
				a.show();
			}
			
        		}

		System.out.println("Student score between 80-100");
		 for( Student a : s)
		{
            			if(a.getScore()>80  &&  a.getScore()<100)
			{
				a.show();
			}
			
        		}	
	}
}