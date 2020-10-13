package sep27;

import java.util.Scanner;

public class Q55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input string:");
		String str = sc.next();
		System.out.println("Input string is:"+str);
		int count=str.length();
		System.out.println("Total number of characters are:"+count);
		sc.close();
	}

}
