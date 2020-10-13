package sep27;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q64 {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\COREJAVA\\dir\\new1.txt"); 
	     FileInputStream fileStream = new FileInputStream(file);
	     InputStreamReader input = new InputStreamReader(fileStream); 
	     BufferedReader reader = new BufferedReader(input);
	     String line=null; 
	     int countWord = 0;
	     int charcount = 0;
	    
	     while((line = reader.readLine())!=null)
	     {
	    	charcount += line.length();
	    	 String[] wordList = line.split("\\s+"); 
	         countWord += wordList.length; 
	     }
	     
	     System.out.println("charater occurence in a given file is: "+charcount);
	     System.out.println("Total word count = " + countWord); 
	     reader.close();

	}

}
