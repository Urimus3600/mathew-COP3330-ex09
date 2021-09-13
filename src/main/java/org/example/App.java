/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Austin Mathew
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        final double gallonMax = 350;
        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the ceiling in feet? ");
        double lngth = input.nextDouble();
        System.out.print("What is the width of the ceiling in feet? ");
        double wdth = input.nextDouble();

        int gallon = (int) Math.ceil((lngth * wdth) / gallonMax);
        System.out.print("You will need to purchase " + gallon + " gallons of paint to cover " +
                (lngth * wdth) + " square feet.");
    }
}
