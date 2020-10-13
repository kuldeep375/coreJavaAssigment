package sep27;

import java.util.Scanner;

public class Q53 {

	public static void main(String[] args) {
	String sum=null;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the input:");
	String str = sc.nextLine();
	String[] s=str.split(",");
	
	for(int i=0;i<s.length;i++)
	{
		sum=sum+s[i];
	}
	int sum1=Integer.parseInt(sum);
	System.out.println("sum ="+sum1);
	sc.close();
	}
}
