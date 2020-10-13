class Swap
{
	public static void main(String args[])
	{
		int a=5;
		int b=8;
		System.out.println("value before swap a=:"+a);
		System.out.println("value before swap b=:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value after swap:a="+a);
		System.out.println("value after swap:b="+b);
	}
}