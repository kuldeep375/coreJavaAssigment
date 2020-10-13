import java.util.Scanner;
class Product
{
	public int pid;
	public float price;
	public int quantity;
	Product()
	{
		
	}
	Product(int pid,float price,int quantity)
	{
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	static void calculate(Product [] arr)
	{
        		double res=0;
        		for(Product a : arr )
		{
            			res = res+(double)(a.price*a.quantity);
        		}
        		System.out.println("Total Amount spent : " +res);
	}
	void show()
	{
		System.out.println(pid+"  "+price+"  "+quantity);
	}
	
}

class ProductDemo
{
	public static void main(String args[])
	{
		Product c[]=new Product[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<c.length;i++)
		{
			System.out.println("Enter Details of Product : ");
           			 int id = sc.nextInt();
           			 float price = sc.nextFloat();
            			int quantity = sc.nextInt();
            			Product p = new Product(id, price,quantity);
			c[i]=p;
		}
		Product p = new Product();
		float max=c[0].price;
		for(Product s : c)
		{
			s.show();	
			if(s.price > max)
			{
				max=s.price;
				p = s;
			}
		}
		System.out.println("Max Product element : "+p.pid+"  "+p.price+"  "+p.quantity );
	}
}