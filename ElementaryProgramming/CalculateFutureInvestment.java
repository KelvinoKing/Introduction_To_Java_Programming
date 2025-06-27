/**
 * (Financial application: calculating the future investment value) Write a program
 * that reads in investment amount, annual interest rate, and number of years, and
 * displays the future investment value using the following formula:
 * futureInvestmentValue =
 * investmentAmount x (1 + monthlyInterestRate)numberOfYears*12
 * For example, if you enter amount 1000, annual interest rate 3.25%, and number of
 * years 1, the future investment value is 1032.98.
 * Hint: Use the Math.pow(a, b) method to compute a raised to the power of b.
 * Here is a sample run:
 */

 import java.util.Scanner;

 public class CalculateFutureInvestment{
    public static void main(String[] args){

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate =    annualInterestRate / 12 / 100;

        System.out.print("Enter number of years: ");
        double numberOfYears = input.nextDouble();

        double futureInvestmentValue = 
        investmentAmount * (Math.pow((1 + monthlyInterestRate), (numberOfYears * 12)));

        System.out.printf("Accumulated value is: %.2f\n", futureInvestmentValue);
    }
 }