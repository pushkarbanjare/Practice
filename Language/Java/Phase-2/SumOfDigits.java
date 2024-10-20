// Write a program to find the sum of the digits of a given number.

// Input: n = 1234
// Output: 10 (because 1 + 2 + 3 + 4 = 10)

import java.util.Scanner;

public class SumOfDigits {
    public static int sumDigit(int n){
        int sum = 0;  // => Time = O(|n|), Space = O(1)
        while (n != 0) {
            sum = sum + (n%10);
            n = n/10;
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(sumDigit(n));

        sc.close();

    }
}