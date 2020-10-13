package sep27;

import java.util.Scanner;

public class Q61 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines");
		int m = sc.nextInt();
		Threaddemo th = new Threaddemo(m);
		Thread t = new Thread(th);
		t.start();
		sc.close();
	}
}

class Threaddemo implements Runnable
{
	int n;
	Threaddemo(int n)
	{
		this.n=n;
	}
	
	
	@Override
	public void run() {
		for(int i=1;i<=n;i++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("*");
		}
		
	}
	
}