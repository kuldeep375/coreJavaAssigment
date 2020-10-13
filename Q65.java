package sep27;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q65 {

	public static void main(String[] args) {
		String filepath="D:\\COREJAVA\\dir\\first.jpg";
		printFileSizeNIO(filepath);		
	}
	private static void printFileSizeNIO(String filepath) {
		Path path = Paths.get(filepath);
		try {
			long bytes = Files.size(path);
			System.out.println(String.format("%,d bytes", bytes));
            System.out.println(String.format("%,d kB", bytes / 1024));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
