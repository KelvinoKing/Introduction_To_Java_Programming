/**
 * (Converting feet into meters) Write a program that reads a number in feet, converts it
 * to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
 */

import java.util.Scanner;

public class ConvertFeetIntoMeters{

    public static void main(String[] args){

        final double MYCONSTANT = 0.305;
        Scanner myObj = new Scanner(System.in);
        double feet;
        double meters;

        System.out.print("Enter a value for feet: ");
        feet = myObj.nextDouble();
        meters = feet * MYCONSTANT;

        System.out.println(feet + " feet is " + meters + " meters.");
    }
}