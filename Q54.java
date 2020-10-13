package sep27;

import java.util.Scanner;

public class Q54 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input string:");
		String str=sc.next();
		System.out.println("Input string is:"+str);
		StringBuilder new1 = new StringBuilder();
		new1.append(str);
		new1=new1.reverse();
		System.out.println("Reversed string is:"+new1);
		sc.close();
	}

}
