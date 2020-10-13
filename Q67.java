package sep27;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Q67 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fs = new FileInputStream("D:\\COREJAVA\\dir\\shopping.txt");
		ObjectInputStream o = new ObjectInputStream(fs);
		Shop st = (Shop)o.readObject();
		System.out.println(st);
		fs.close();
		System.out.println("done");	
	}

}
