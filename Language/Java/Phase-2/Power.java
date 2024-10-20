// Calculate Power using Recursion
// Write a program to calculate x^n using recursion.

// Input: x = 2, n = 3
// Output: 8

import java.text.NumberFormat.Style;
import java.util.Scanner;

/**
 * Power
 */
public class Power {
    public static int powRec(int n, int p){
        if(p == 0){
            return 1;
        }
        return n * powRec(n, p-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number and exponential: ");
        int num = sc.nextInt();
        int pow = sc.nextInt();
        System.out.println(powRec(num, pow));
        sc.close();
    }
}