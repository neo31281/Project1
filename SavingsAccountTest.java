
//SavingsAccountTest.java
//Due date: February 18 2015

public class SavingsAccountTest {

	public static void main(String[]args){
		//Instantiate
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);

		//Set Annual Interest Rate
		saver1.modifyInterestRate(.04);
		saver2.modifyInterestRate(.04);
		//Calculate Monthly Interest
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		//Output info
		System.out.println("Saver 1");
		System.out.println(saver1);
		System.out.println();
		System.out.println("Saver 2:");
		System.out.println(saver2);
		System.out.println();

		//Set new Annual Interest Rate
		saver1.modifyInterestRate(.05);
		saver2.modifyInterestRate(.05);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("Saver 1");
		System.out.println(saver1);
		System.out.println();
		System.out.println("Saver 2:");
		System.out.println(saver2);
		System.out.println();

		//Deposit Test
		saver1.deposit(2000);
		System.out.println("Saver 1");
		System.out.println(saver1);
		System.out.println();

		//Withdrawal Test
		saver2.withdrawal(3001); //Should pass because the account has 3045.25 

		saver2.withdrawal(2500); //Should fail


	}
}
