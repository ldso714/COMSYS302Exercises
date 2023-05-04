//  Completed!
//  Given an integer N, print its first 10 multiples.
//  Each multiple N x i (where I in the inclusive range of  1 and 10) should be printed on a new line in the form:
//  N x i = result.
//  Complete the code provided in exercise1_4_todo
package com.example;

import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        //complete lines here
        for (int i = 1; i <= 10; i++) {
            System.out.print(N + " x " + i + " = " + (N * i) + "\n");
        }
    }
}