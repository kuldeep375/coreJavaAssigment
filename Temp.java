import java.util.Scanner;
class Temp
{
	public static void main(String args[])
	{
		int tempf,tempc;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the tempearture to convert: ");
		tempf = sc.nextInt();	
		tempc=(5*(tempf-32)/9);
		System.out.println("Temperature in celcuis:  "+tempc);	
	}
}