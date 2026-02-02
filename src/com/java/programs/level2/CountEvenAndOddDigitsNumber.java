package com.java.programs.level2;

import java.util.Scanner;

public class CountEvenAndOddDigitsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int digit=0;
        int evenCount=0;
        int oddCount=0;
        while(n>0){
            digit=n%10;
        if(digit%2==0){
            evenCount=evenCount+1;
        }
        else{
            oddCount=oddCount+1;
        }
        n=n/10;
        }
        System.out.println("evenCont : " + evenCount);
        System.out.println("oddCount : " + oddCount);
        sc.close();

    }
}
