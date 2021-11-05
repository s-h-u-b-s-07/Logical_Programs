package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class Logical_programs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Prime Number:: ");
        int numPrimeCheck = sc.nextInt();

        PrimeNum(numPrimeCheck);
    }

    public static void PrimeNum(int numPrimeCheck) {

        int halfCondition = 0;
        int flag = 0;

        halfCondition = numPrimeCheck / 2;
        if (numPrimeCheck == 0 || numPrimeCheck == 1) {
            System.out.println(numPrimeCheck + " is not prime number");
        } else {
            for (int i = 2; i <= halfCondition; i++) {
                if (numPrimeCheck % i == 0) {
                    System.out.println(numPrimeCheck + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(numPrimeCheck + " is prime number.");
            }
        }

    }
}
