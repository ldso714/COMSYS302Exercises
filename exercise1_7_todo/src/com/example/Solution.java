//  Completed!
//  Given the time in numerals we may convert it into words, as shown on the right.
//
//  For example, when minutes = 0, use o’clock. For minutes in the inclusive range of 1 and 30 ,
//  use past, and for minutes > 30 use to. Note the space between the apostrophe and clock in o’clock.
//  Complete the timeInWords function in exercise1_7_todo which prints the time in words
//  for the input given in the format described. (0< h <=12)
package com.example;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int minutes = scan.nextInt();

        String[] byOne = {"0", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen",
                "nineteen", "twenty", "twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five",
                "twenty-six", "twenty-seven", "twenty-eight", "twenty-nine"};

        String[] byQuarter = {" o' clock", "quarter past ", "half past ","quarter to "};

        if (minutes == 0){
            System.out.print(byOne[hour] + byQuarter[0]);
        }
        if (minutes % 15 == 0) {
            if (minutes == 15) {
                System.out.print(byQuarter[1] + byOne[hour]);
            }
            else if (minutes == 30) {
                System.out.print(byQuarter[2] + byOne[hour]);
            }
            else if (minutes == 45) {
                System.out.print(byQuarter[3] + byOne[hour]);
            }
        }
        else if (minutes >= 1 && minutes <= 30){
            System.out.print(byOne[minutes] + " minutes past " + byOne[hour]);
        }
        else if (minutes >30){
            System.out.print(byOne[60-minutes] + " minutes to " + byOne[hour+1]);
        }
    }
}