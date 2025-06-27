/**
 * If you know the balance and the
 * annual percentage interest rate, you can compute the interest on the next monthly
 * payment using the following formula:
 * interest = balance * 1annualInterestRate / 12002
 * Write a program that reads the balance and the annual percentage interest rate and
 * displays the interest for the next month in two versions: (a) Use dialog boxes to
 * obtain input and display output; (b) Use console input and output. Here is a sam-ple run:
 */

 import java.util.Scanner;

public class CalculateInterest {
    public static void main(String[] args){

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double interestRate = input.nextDouble();

        double interest = balance * (interestRate / 1200);

        System.out.println("The interest is: " + interest);
    }
}
