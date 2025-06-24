/**
 * (Financial application: payroll) Write a program that reads the following infor-
 * mation and prints a payroll statement:
 * Employee’s name (e.g., Smith)
 * Number of hours worked in a week (e.g., 10)
 * Hourly pay rate (e.g., 6.75)
 * Federal tax withholding rate (e.g., 20%)
 * State tax withholding rate (e.g., 9%)
 */

import java.util.Scanner;

public class PayrollConsole {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        int hours = input.nextInt();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTaxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();

        double totalDeduction = (hours * payRate * federalTaxRate) + 
        (hours * payRate * stateTaxRate);


        System.out.println("Employee Name: " + name + "\n" +
        "Hours Worked: " + hours + "\n" +
        "Pay Rate: $" + payRate + "\n" +
        "Gross Pay: $" + (hours * payRate) + "\n" +
        "Deductions: " + "\n" + "\t" +
        "Federal Withholding (" + (federalTaxRate * 100) + "%): $" +
        (hours * payRate * federalTaxRate) + "\n" + "\t" +
        "State Withholding (" + (stateTaxRate * 100) + "%): $" +
        (hours * payRate * stateTaxRate) + "\n" + "\t" +
        "Total Deductions: $" + totalDeduction + "\n" +
        "Net pay: $" + ((hours * payRate) - totalDeduction));
    }
}
