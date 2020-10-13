import java.util.Scanner;
class Stringarray
{
	public static void main(String args[])
	{
		String arr[]=new String[5];
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextLine();
		}
		System.out.println("String array elements are:");
		for(String a : arr)
		{
			System.out.println(a);
		}
	}
}