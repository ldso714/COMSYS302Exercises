//  Completed!
//  You are in charge of the cake for your niece's birthday and have decided
//  the cake will have one candle for each year of her total age.
//  When she blows out the candles, she’ll only be able to blow out the tallest ones.
//  Your task is to find out how many candles she can successfully blow out.
//  For example, if your niece is turning 5 years old, and the cake will have 5 candles of height 6, 6, 2, 1, 6,
//  she will be able to blow out 3 candles successfully,
//  since the tallest candles are of height 6 and there are 3 such candles.
//  Please Complete the function birthdayCakeCandles in the exercise 1_6_todo.
//  It must return an integer representing the number of candles she can blow out.
package com.example;

import java.util.*;

public class Solution {
    static int birthdayCakeCandles(int[] ar) {
        int totalNumber = 0;
        int highestNumber = 0;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > highestNumber) {
                highestNumber = ar[i];
            }
        }

        for (int j = 0; j < ar.length; j++) {
            if (ar[j] == highestNumber) {
                totalNumber = totalNumber + 1;
            }
        }
        return totalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];
        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);
        System.out.println(result);
        scanner.close();
    }
}