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
public class IsPrime {
    public static void main(String[] args)
    {
        boolean isPrime = true;
        Scanner keyboard = new Scanner(System.in);
        int number = 0;
        
        System.out.println("Enter a positive integer.");
        number = keyboard.nextInt();
        
        for(int i=2; 2*i<number; i++)
        {
            if(number%i==0)
            {
                isPrime = false;
            }    
            else
            {
                isPrime = true;
            }
        }
        if (isPrime = true)
        {
            System.out.println(number + " is a prime number.");
        }
        else
        {
            System.out.println(number + " is not a prime number.");
        }
    }
}
