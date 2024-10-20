// Write a program to check if a given number is a palindrome.

// Input: n = 121
// Output: 121 is a palindrome

import java.util.Scanner;

public class PalindromeNo {
    public static int paldNo(int n) {
        int rev = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int reversed = paldNo(n);
        if (n == reversed) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
        sc.close();
    }
}