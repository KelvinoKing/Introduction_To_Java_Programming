/**
 * (Financial application: calculating tips) Write a program that reads the subtotal
 * and the gratuity rate, then computes the gratuity and total. For example, if the user
 * enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gra-
 * tuity and $11.5 as total. Here is a sample run:
 */

import java.util.Scanner;

public class CalculatingTips{
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);
        double subtotal, gratuityRate;
        double total, gratuity;

        System.out.print("Enter the subtotal and gratuity rate: ");
        subtotal = myObj.nextDouble();
        gratuityRate = myObj.nextDouble();

        gratuity = (gratuityRate / 100) * subtotal;
        total = gratuity + subtotal;

        System.out.println("The gartuity is " + gratuity + " and the total is " + total);
    }
}