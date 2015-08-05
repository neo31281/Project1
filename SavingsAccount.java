
//SavingsAccount.java
//Due date: February 18 2015

public class SavingsAccount {

	private static double annualInterestRate;
	private static double savingsBalance;

	//Overloaded constructors
	public SavingsAccount(){
		setSavingsBalance(0);
	}

	public SavingsAccount(double savings){
		setSavingsBalance(savings);
	}

	//A method to calculate the monthly interest 
	public void calculateMonthlyInterest() {
		double monthlyInterest = getSavingsBalance() * (getAnnualInterestRate() / 12);
		setSavingsBalance(getSavingsBalance() + monthlyInterest);
	}

	//A static method modifyInterestRate that sets the annualInterestRate to a new value. 
	public static void modifyInterestRate(double newInterest) {
		setAnnualInterestRate(newInterest);
	}

	//Deposit
	public static void deposit(double depositAmount){
		if(depositAmount > 0){
			setSavingsBalance(getSavingsBalance() + depositAmount);
			System.out.printf("$%.2f has been successfully deposited into your account.\n", 
				depositAmount);
		}else{
			System.out.println("Please enter a valid deposit amount.");
		}
	}

	//Withdrawal
	public void withdrawal(double withdrawalAmount){
		if(withdrawalAmount <= getSavingsBalance()){
			setSavingsBalance(getSavingsBalance() - withdrawalAmount);
			System.out.printf("$%.2f has been successfully withdrawn from your account.\n", 
				withdrawalAmount);
		}else{
			System.out.println("You do not have that much money in your account.");
		}
	}


	//Getters
	private static double getSavingsBalance(){
		return savingsBalance;
	}

	private static double getAnnualInterestRate(){
		return annualInterestRate;
	}

	//Setters
	private static void setSavingsBalance(double newSavings){
		savingsBalance = newSavings;
	}

	private static void setAnnualInterestRate(double newInterest){
		annualInterestRate = newInterest;
	}

	//return a String of the account info
	public String toString() {
		return String.format("Savings Balance: %.2f\nAnnual Interest Rate: %.2f\n", 
			getSavingsBalance(), getAnnualInterestRate());
	}


}
