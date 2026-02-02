package com.java.programs.level2;

import java.util.Scanner;

public class SmallestDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int digit=0;
        int min=0;
        while (n>0){
            digit=n%10;
            if (digit<min){
                min=digit;
            }
            n=n/10;
        }
        System.out.println(min);
        sc.close();

    }
}
