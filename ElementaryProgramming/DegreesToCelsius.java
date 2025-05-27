/**
 (Converting Celsius to Fahrenheit) Write a program that reads a Celsius degree in 
 double from the console, then converts it to Fahrenheit and displays the result. 
 Theformula for the conversion is as follows: fahrenheit = (9 / 5) * celsius + 32 
 Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
**/

import java.util.Scanner;

public class DegreesToCelsius
{
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);
        Double celsius;
        Double fahrenheit;

        System.out.print("Enter a degree in Celsius:");
        celsius = myObj.nextDouble();

        fahrenheit = (9.0 / 5.0) * celsius + 32;


        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");

    }
}
