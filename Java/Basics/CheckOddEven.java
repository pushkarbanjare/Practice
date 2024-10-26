// Write a program to check if a given number is odd or even.

// Input: n = 7
// Output: 7 is an odd number

import java.util.Scanner;

public class CheckOddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        sc.close();
    }
}