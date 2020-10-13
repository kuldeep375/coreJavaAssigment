package sep27;

import java.util.Scanner;

public class Q57 {
	public static String reverseWord(String str)
	{  
	    String words[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words)
	    {  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    	return reverseWord.trim();  
	}  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input: ");
		String str = sc.nextLine();
		System.out.println("reverse output is: "+reverseWord(str));
		sc.close();
	}

}
