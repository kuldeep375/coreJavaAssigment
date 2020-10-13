package sep27;

import java.util.Scanner;

public class Strfunctions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		int count=0;
		String str = sc.next();
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u')
			{
				count++;
			}
		}
		System.out.println("number of vowels are: "+count);
		sc.close();
	}

}
