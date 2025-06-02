/**
 * (Converting pounds into kilograms) Write a program that converts pounds into
 * kilograms. The program prompts the user to enter a number in pounds, converts it
 * to kilograms, and displays the result. One pound is 0.454 kilograms. Here is a
 * sample run:
 */

import java.util.Scanner;

public class ConvertPoundsToKilograms{
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);
        final double MYCONSTANT = 0.454;
        double pounds;
        double kilograms;

        System.out.print("Enter a number in pounds: ");
        pounds = myObj.nextDouble();
        kilograms = pounds * MYCONSTANT;

        System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
    }
}