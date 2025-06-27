/**
 * If you know the balance and the
 * annual percentage interest rate, you can compute the interest on the next monthly
 * payment using the following formula:
 * interest = balance * 1annualInterestRate / 12002
 * Write a program that reads the balance and the annual percentage interest rate and
 * displays the interest for the next month in two versions: (a) Use dialog boxes to
 * obtain input and display output; (b) Use console input and output. Here is a sam-ple run:
 */

import javax.swing.JOptionPane;

public class CalculateInterestDialog {
    public static void main(String[] args){
        
        double balance = Double.parseDouble(JOptionPane.showInputDialog("Enter balance"));
        double interestRate = Double.parseDouble(JOptionPane.showInputDialog("Enter interest rate e.g., 3 for 3.5"));

        double interest = balance * (interestRate / 1200);

        JOptionPane.showMessageDialog(null, "The interest is: " + interest);
    }
}
