
/**
 * The Purpose of this class called morgage is to create a morgage calculator that will calculate the fixed rate mograge payment.
 * @author (Elijah Pemberton)
 * @version (10/2/18)
 */
 
import java.util.Scanner;
 public class Morgage
 {
 public static void main(String[] args) {
		// Create a Scanner called input
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the loan amount,
		// the number of years and the annual interest rate
		System.out.print("Enter the principle to borrow: $");
		double loanAmount = input.nextDouble();
		System.out.print("Enter the term (in years): ");
		int years = input.nextInt();
		System.out.print("Enter the interestRate in decimal: ");
		double annualRate = input.nextDouble();

		// This will calculate monthly interest rate
		double monthlyRate = annualRate / 12;

		// This will calculate montly payment
		double monthlyPayment = loanAmount * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, years * 12));

		// This will create the schedule like layout showing the months, total interest, payment and balance of the morgage.
		double balance = loanAmount,principal, interest;
		System.out.println("Month     Total Interest  Payment      Balance");
		for (int i = 1; i <= years * 12; i++) {
			interest = monthlyRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", i, interest,
				monthlyPayment, balance);
		}
	}
 }
