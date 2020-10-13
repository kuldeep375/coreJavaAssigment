class MathOperation
{
	int add(int a,int b)
	{
		return a+b;
	}
	
	double add(float a,float b,float c)
	{
		return a+b+c;
	}
	
	int add(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		sum+=a[i];
		return sum;
	}
	double add(double a,int b)
	{	
		return a+b;
	}			
} 

class MathDemo
{
	public static void main(String args[])
	{
		int arr[]={10,20,30,40,50};
		 MathOperation m=new  MathOperation();
		int res=m.add(5,3);	
		double res1=m.add(5.3f,3.4f,4.5f);
		int res2=m.add(arr);	
		double res3=m.add(3.45,5);
		System.out.println(" two int addition is:  "+res+"  three float addition is:  " +res1+ " array addition is:  " +res2+  " one int and one float addition is:  "+res3);
	}
}