interface Taxable
{
	double salesTax = 0.07;
	double incomeTax = 0.105;
	
	abstract void calcTax();
} 
class Employee implements Taxable
{
	int empId;
	String name;
	double salary;
	Employee() {
	}
	Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	 public void calcTax()
	{
		double Tax = salary*incomeTax;
		System.out.println("the yearly tax is =" + Tax);
	}
}

class Productp implements Taxable
 {
	int pid;
	double price;
	int quantity;

	Productp() {

	}

	Productp(int pid, double price, int quantity)
	 {
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}

	 public void calcTax() {
		double saleTax = (price * quantity) * salesTax;
		System.out.println("the salestax is = " + saleTax);
	}
}

class Q49
{
	public static void main(String args[])
	{
		 Taxable pt = new Productp(101,2400,5);
		pt.calcTax();
		 Taxable  em = new  Employee (123,"kanchan",45000);
		em.calcTax();
			
	}
}