//  Completed!
//  A program requires to read an integer, a double , and a string from stdin, then print the values
//  according to the instructions in the Output Format section below.
//  To make the problem a little easier, a portion of the code is provided for you in the exercise1_2_todo project.
package com.example;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
