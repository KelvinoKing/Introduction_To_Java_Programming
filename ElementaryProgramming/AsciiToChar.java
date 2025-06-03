/**
 * (Finding the character of an ASCII code) Write a program that receives an ASCII
 * code (an integer between 0 and 128) and displays its character. For example, if the
 * user enters 97, the program displays character a. Here is a sample run:
 */

import java.util.Scanner;

public class AsciiToChar{
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);
        int myAscii;
        char ch;

        System.out.print("Enter an ASCII code: ");
        myAscii = myObj.nextInt();
        ch = (char) myAscii;

        System.out.println("The character for ASCII code " + myAscii + " is " + ch);
    }
}