package sep27;

import java.util.Scanner;

public class Q58 {
	public static void main(String[] args) {
		String arr[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the position you want [between 0 -6]: ");
		try {
				int pos=sc.nextInt();
				for(int i=1;i<=pos;i++)
				{
					if(i==pos)
					{
						System.out.println("Day is: "+arr[pos]);
					}
				}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please enter valid day no. [between 0-6]");
		}
		
		sc.close();

	}

}
