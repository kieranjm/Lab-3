/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author kjm61
 */
public class PaintJobEstimator {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double squareFeet = 0;
        double hours = 0;
        double pay = 0;
        double gallons = 0;
        double paintPrice = 0;
        double rooms = 0;
        double total = 0;
        
        System.out.println("How many rooms?");
        rooms = keyboard.nextDouble();
        System.out.println("Square feet per wall?");
        squareFeet = keyboard.nextInt();
        squareFeet = squareFeet * rooms;
        
        System.out.println("Price of paint?");
        paintPrice = keyboard.nextDouble();
        
        for (int i=115; i<=squareFeet; i=i+115)
        {
            gallons=gallons+1;
            hours=hours+8;
            pay=pay+18;
            paintPrice = paintPrice*gallons;
        }
        total=(pay+paintPrice) * rooms;
        System.out.println("Gallons of paint required: " + gallons);
        System.out.println("Hours of labor required: " + hours);
        System.out.println("Cost of paint: " + paintPrice);
        System.out.println("Labor cost: $" + pay);
        System.out.println("Total cost: $" + total);
        
    }
}
