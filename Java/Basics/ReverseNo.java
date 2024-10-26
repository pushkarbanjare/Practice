// Write a program to reverse the digits of a given number.

// Input: n = 1234
// Output: 4321

import java.util.Scanner;

public class ReverseNo {
    // static int rev = 0;
    // public static void revNo(int n){
        // if(n <= 0){
        //     return;
        // }
        // int rem = n % 10;
        // rev = (rev * 10) + rem;
        // revNo(n / 10);

    // }

    public static int revNo(int n){
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
        // revNo(n);
        // System.out.println(rev);

        System.out.println(revNo(n));


        sc.close();
    }
}