/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.compoundinterest;

/**
 *
 * @author Mixobright
 */
import java.util.Scanner;

public class CompoundInterest{
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double rate = input.nextDouble();

        System.out.print("Enter the time (in years): ");
        double time = input.nextDouble();

        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = input.nextInt();

        double compoundInterest = principal * Math.pow((1 + rate / 100), (n * time)) - principal;

        System.out.println("Principal amount: " + principal);
        System.out.println("Annual interest rate: " + rate + "%");
        System.out.println("Time (in years): " + time);
        System.out.println("Number of times interest is compounded per year: " + n);
        System.out.println("Compound Interest: " + compoundInterest);

        input.close();
    }
}


    

