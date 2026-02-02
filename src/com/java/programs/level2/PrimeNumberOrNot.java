package com.java.programs.level2;

import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            if (number <= 1) {
                System.out.println("Not Prime");
                return;
            }

            boolean flag = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }

            sc.close();
        }
    }



