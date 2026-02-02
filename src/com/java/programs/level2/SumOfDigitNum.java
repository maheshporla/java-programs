package com.java.programs.level2;

import java.util.Scanner;

public class SumOfDigitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int sum=0;
        while (n>0){
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println(sum);
        sc.close();
    }
}
