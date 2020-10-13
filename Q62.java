package sep27;

import java.util.Scanner;

public class Q62 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check: ");
		int num = sc.nextInt();
		Thrdemo tr = new Thrdemo(num);
		Thread t = new Thread(tr);
		t.start();
		sc.close();
	}

}

class Thrdemo implements Runnable{

	int n;
	
	Thrdemo(int n)
	{
		this.n=n;
	}
	@Override
	public void run() {
		boolean flag=true;
		if(n==1)
			flag=false;
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
					flag=false;
				else
					flag=true;
			}
			
		}
		
		if(flag)
			System.out.println("given number is prime number");
		else
			System.out.println("given number is not prime number");
		
	}
	
}