// Write a program to generate the Fibonacci series up to n terms.

// Input: n = 5
// Output: 0 1 1 2 3

import java.util.Scanner;
public class Fibonacci {
    public static void fibIterative(int n){
        int x = 0;
        int y = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(x + " ");
            int z = x + y;
            x = y;
            y = z;
        }
    }

    public static int fibRecursive(int n){
        if (n <= 1) {
            return n;
        }
        return fibRecursive(n-1) + fibRecursive(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        // int n = sc.nextInt();
        // iterative way => Time = O(n), Space = O(1)
        // fibIterative(n);

        // recursive way => Time = O(2^n), Space = O(n)
        // for (int i = 0; i < n; i++) {
        //     System.out.print(fibRecursive(i) + " ");
        // }

        sc.close();
    }
}