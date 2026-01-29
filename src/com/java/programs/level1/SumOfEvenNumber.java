package com.java.programs.level1;

import java.util.Scanner;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int sum=0;
        for(int i = 1 ;i<=n;i++) {
            if(i%2==0)
            sum = sum + i;
        }
        System.out.println("Sum of first " + n + " Even  numbers = " + sum);
        sc.close();
    }
}
