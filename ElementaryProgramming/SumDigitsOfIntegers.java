/**
 * (Summing the digits in an integer) Write a program that reads an integer between
 * 0 and 1000 and adds all the digits in the integer. For example, if an integer is 932,
 * the sum of all its digits is 14.
 * Hint: Use the % operator to extract digits, and use the / operator to remove the
 * extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
 */

import java.util.Scanner;

public class SumDigitsOfIntegers{
    public static void main(String[] args){
        int a = 0;
        int b = 0;
        int c = 0;
        int myInteger, totalSum;

        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        myInteger = myObj.nextInt();
        a = myInteger % 10;
        b = (myInteger / 10) % 10;
        c = (myInteger / 100);
        totalSum = a + b + c;

        System.out.println("The sum of the digits is: " + totalSum);
    }
}