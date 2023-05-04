//  Completed!
//  A program requires to use if-else conditional statements to automate decision-making processes.
//  Given an integer, n, perform the following conditional actions:
//	If n is odd, print Weird
//	If n is even and in the inclusive range of 2 to 10, print Not Weird
//	If n is even and in the inclusive range of 11 to 30, print Weird
//	If n is even and greater than 30, print Not Weird
//  Complete the code provided in exercise1_3_todo to print whether or not n is weird.
package com.example;

import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if (N % 2 == 1){
            System.out.print("Weird");
        } else if ((N >= 2) && (N <= 10)) {
            System.out.print("Not Weird");
        } else if ((N >= 11) && (N <= 30)) {
            System.out.print("Weird");
        } else if (N > 30) {
            System.out.print("Not Weird");
        }
    }
}