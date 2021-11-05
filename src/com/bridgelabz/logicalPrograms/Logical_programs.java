package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class Logical_programs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reversed :: ");
        int numToReverse = sc.nextInt();

        ReverseNum(numToReverse);
    }
    public static void ReverseNum(int numToReverse){

        int reversedNum = 0;
        while (numToReverse != 0) {
            int remenderDigit = numToReverse % 10;
            reversedNum = reversedNum * 10 + remenderDigit;
            numToReverse /= 10;
        }

        System.out.println("Reversed Number: " + reversedNum);

    }
}
