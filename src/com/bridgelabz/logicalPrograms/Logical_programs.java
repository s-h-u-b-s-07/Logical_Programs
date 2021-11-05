package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class Logical_programs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check perfect number:: ");
        int perfectCheck = sc.nextInt();


        PerfectCheck(perfectCheck);
    }
    public static void PerfectCheck(int perfectCheck) {

        int remainder;
        int sum = 0;

        for (int i = 1; i < perfectCheck; i++) {
            remainder = perfectCheck % i;
            if (remainder == 0) {
                sum = sum + i;
            }
        }
        if (sum == perfectCheck) {
            System.out.println("The number is Perfect Number");
        } else {
            System.out.println("The number is not Perfect Number");
        }

    }
}
