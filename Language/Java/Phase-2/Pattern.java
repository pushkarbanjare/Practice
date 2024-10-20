// 1. Write a program to print a right-angle triangle pattern of stars.

// Input: n = 5
// Output:
// *
// **
// ***
// ****
// *****


// 2. Write a program to print a pyramid pattern.

// Input: n = 5
// Output:
//     *
//    ***
//   *****
//  *******
// *********

import java.util.Scanner;

public class Pattern {
    public static void one(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void two(int n) {
        for (int i = 1; i <= n; i++){
            // space
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // star
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        one(n);
        two(n);

        sc.close();
    }
}