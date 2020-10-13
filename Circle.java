import java.util.Scanner;
class CircleDemo
{
	private int radius;
	private float Area;
	private float pi=3.14F;
	
	void init()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius for the circle: ");
		radius=sc.nextInt();	
		
	}

	void calculateArea()
	{
		Area=2*pi*radius*radius;
	}

	void display()
	{
		System.out.println("Area of Cicle is  "+Area);
	}
}

class Circle
{
	public static void main(String args[])
	{
		CircleDemo c=new CircleDemo();
		c.init();
		c.calculateArea();
		c.display();
	}
}