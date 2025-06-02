/**
 * (Computing the volume of a cylinder) Write a program that reads in the radius and
 * length of a cylinder and computes volume using the following formulas:
 * area = radius * radius * π
 * volume = area * length
 */

import java.util.Scanner;
import java.lang.Math;

public class ComputeVolumeOfCylinder{

    public static void main(String[] args){

        double radius = 0;
        double length = 0;
        double area;
        double volume;

        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the radius and length of the cylinder: ");
        radius = myObj.nextDouble();
        length = myObj.nextDouble();

        area = radius * radius * Math.PI;
        volume = area * length;

        System.out.println("The area is: " + area);
        System.out.println("The volume is: " + volume);
    }
}