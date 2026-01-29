package com.java.programs.level1;

import java.util.Scanner;

public class CountOfDigitsInNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int count=0;
        while (n>0) {
            n = n / 10;
            count = count + 1;
        }
        System.out.println(count);
        sc.close();
    }
}
