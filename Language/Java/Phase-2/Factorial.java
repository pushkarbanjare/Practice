// Write a program to calculate the factorial of a given number n.

// Input: n = 5
// Output: 120 (because 5! = 5 * 4 * 3 * 2 * 1)

import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        // if(n == 0){ // => Time = O(n), Space = O(n)
        //     return 1;
        // }
        // return n * fact(n-1);

        return (n == 0) || (n == 1) ? 1 : n * fact(n-1);  // => Time = O(n), Space = O(n)

        // int res = 1; // => Time = O(n), Space = O(1)
        // for (int i = 2; i <= n; i++) {
        //     res = res * i;
        // }
        // return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(fact(n));
        sc.close();
    }
}