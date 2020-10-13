package sep27;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Shop implements Serializable
{
	private String itemName;
	private int price;
	private int quantity;
	public Shop(String itemName, int price, int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Shop [itemName=" + itemName + ", price=" + price + ", quantity=" + quantity + "]";
	}
		
}
public class Q66 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fs = new FileOutputStream("D:\\COREJAVA\\dir\\shopping.txt");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(new Shop("smartwatch",1200,4));
		fs.close();
		System.out.println("Done");
	}

}
