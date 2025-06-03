/**
 * (Finding the number of years) Write a program that prompts the user to enter the
 * minutes (e.g., 1 billion) and displays the number of years and days for the minutes.
 * For simplicity, assume a year has 365 days. Here is a sample run:
 */

import java.util.Scanner;

public class MinutesToYears{
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);
        int minutes;
        int years;
        int days;

        System.out.print("Enter the number of minutes: ");
        minutes = myObj.nextInt();
        years = (minutes / (24 * 60)) / 365;
        days = (minutes / (24 * 60)) % years;

        System.out.println(minutes + " has approximately " + years + " years and " + days + " days.");
    }
}