package com.java.programs.level1;

import java.util.Scanner;

public class PrintEachDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int digit=0;
        while (n>0) {
            digit = n % 10;
            System.out.println(digit);
            n=n/10;
        }
        sc.close();
    }
}
