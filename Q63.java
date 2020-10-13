package sep27;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q63 {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\COREJAVA\\dir\\new1.txt"); 
	      FileInputStream fileStream = new FileInputStream(file);
	     InputStreamReader input = new InputStreamReader(fileStream); 
	     BufferedReader reader = new BufferedReader(input);
	     String line; 
	     int countchWord = 0;
	     while((line = reader.readLine())!=null)
	     {
	    	 for(int i=0;i<line.length();i++)
	    	 {
	    		 if(line.charAt(i)=='t')
	    			 countchWord++;
	    	 }
	     }
	    
	     System.out.println("charater occurence in a given file is: "+countchWord+" times");

	     reader.close();
	}

}
