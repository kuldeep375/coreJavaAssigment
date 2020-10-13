import java.util.Scanner;
class Company
{
		
		public static void main(String args[])
		{
			int basic,HRA=0;
			int DA=0;
			int Grosssal=0;
			Scanner sc=new Scanner(System.in);
		  	 System.out.println("Enter the salary of Employee:");
			basic=sc.nextInt();
			System.out.println("Salary is:"+basic);	
			if(basic<10000)
			{
				HRA=(basic*10)/100;
				DA=(basic*90)/100;		
			}
			 if(basic>=10000)
			{
				HRA=2000;
				DA=(basic*98)/100;	
				
			}
			Grosssal=basic+DA+HRA;
			System.out.println("Gross salary is: "+Grosssal);
		}
}