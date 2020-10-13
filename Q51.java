package sep27;

import java.util.Scanner;

abstract class Account{
	
	Scanner sc= new Scanner(System.in);
	int Acc_no;
	String name;
	double balance;
	String branch;
	abstract void Withdraw();
	void OpenAcc(int Acc_no, String name, double balance, String branch) {
		this.Acc_no=Acc_no;
		this.name=name;
		this.balance=balance;
		this.branch=branch;
	}
	abstract void Diposit();

	void Display()
	{
		System.out.println("Account no="+Acc_no);
		System.out.println("Account Holder Name="+name);
		System.out.println("Balance="+balance);
		System.out.println("Branch Name="+branch);
		
	}
}
class SavingAcc extends Account{
	
	@Override
	void Withdraw() {
		
		System.out.println("Enter amount");
		double withAmt= sc.nextDouble();
		if(super.balance-withAmt>=5000)
		{
			super.balance-=withAmt;
			System.out.println("Current balance is= "+balance);
		}
		else 
		{
			System.out.println("You have not sufficent balance");
		}
		
	}

	@Override
	void Diposit() {
		
		System.out.println("Enter amount");
		double dipoAmt= sc.nextDouble();
		super.balance+=dipoAmt;
		System.out.println("Current balance is="+balance);
	}

	@Override
	void OpenAcc(int Acc_no,String name,double balance,String branch) {
		
		super.OpenAcc(Acc_no, name, balance, branch);
	}	
}
public class Q51 {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter which type of Acount you want to open");
		System.out.println("1.Saving Account with minimun balance=5000");
		System.out.println("2.Current Account with minimum balance=1000");
		int choice=sc1.nextInt();
		if(choice==1)
		{
			System.out.println("Enter Name");
			String name=sc1.next();
			System.out.println("Enter Account No");
			int Acc_no=sc1.nextInt();
			System.out.println("Enter Balance");
			double balance=sc1.nextDouble();
			System.out.println("Enter Branch");
			String branch=sc1.next();
			if(balance>=5000)
			{
				
				SavingAcc A=new SavingAcc();
				A.OpenAcc(Acc_no,name,balance,branch);
				A.Display();
				System.out.println("What you want");
				System.out.println("1.WithDraw Mony");
				System.out.println("2.Diposite mony");
				int cho=sc1.nextInt();
				if(cho==1)
				{
					A.Withdraw();
				}
				if(cho==2)
				{
					A.Diposit();
				}
			}
			else
			{
				System.out.println("minimum balance required=5000");
			}
		}
		if(choice==2)
		{
			System.out.println("Enter Name");
			String name=sc1.next();
			System.out.println("Enter Account No");
			int Acc_no=sc1.nextInt();
			System.out.println("Enter Balance");
			double balance=sc1.nextDouble();
			System.out.println("Enter Branch");
			String branch=sc1.next();
			
			if(balance>=1000)
			{
				SavingAcc A=new SavingAcc();
				A.OpenAcc(Acc_no,name,balance,branch);
				A.Display();
				System.out.println("What you want");
				System.out.println("1.WithDraw Mony");
				System.out.println("2.Diposite mony");
				int cho=sc1.nextInt();
				if(cho==1)
				{
					A.Withdraw();
				}
				if(cho==2)
				{
					A.Diposit();
				}
			}
			else
			{
				System.out.println("minimum balance required=5000");
			}
		}
		sc1.close();
	}

}
