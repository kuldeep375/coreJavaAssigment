class Primitivedata
{	
	public static void main(String args[])
	{
		//int x=3;
		//int y=((x*x)+(3*x)-7);
		//System.out.println("value of y="+y);
		
		//int y=((x++)+(++x));
		//System.out.println("value of x="+x);
		//System.out.println("value of y="+y);

		//int z=((x++) -(--y)-(--x)+(x++));
		//System.out.println("value of x="+x);
		//System.out.println("value of y="+y);
		//System.out.println("value of z="+z);	
		
		boolean x=false;
		boolean y=true;
		boolean z=x && y || !(x || y);
		System.out.println("value of x="+x);
		System.out.println("value of y="+y);
		System.out.println("value of z="+z);	
		
	}
}