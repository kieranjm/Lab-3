/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab3;

import java.util.Random;

/**
 *
 * @author kjm61
 */
public class EvenOddCounter {
    public static void main(String[] args)
    {
        Random rand = new Random();
        int counter = 100;
        int odds = 0;
        int evens = 0;
        boolean isEven = false;
        
        
        for (int i=1; i<=counter; i++)
        {
            int random = rand.nextInt(1000);
            if (random%2==0)
            {
                isEven = true;
                evens++;
            }
            else
            {
                isEven = false;
                odds++;
            }
        }
        System.out.println("There were " + evens + " even numbers.");
        System.out.println("There were " + odds + " odd numbers.");
    }
}
