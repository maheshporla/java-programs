package com.java.programs.level2;

import java.util.Scanner;

public class ProductOfDigitsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int product=1;
        while (n>0){
            int digit=n%10;
            product=product*digit;
            n=n/10;
        }
        System.out.println(product);
        sc.close();
    }
}
