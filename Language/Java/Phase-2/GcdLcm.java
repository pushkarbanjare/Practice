// 1. Write a program to find the GCD of two numbers using the Euclidean algorithm.

// Input: a = 12, b = 18
// Output: 6

// 2. Write a program to calculate the Least Common Multiple (LCM) of two numbers.

// Input: a = 4, b = 6
// Output: 12

import java.util.Scanner;

public class GcdLcm {
    public static int gcdlcm(int a, int b){
        // acc to Euclidean, if a>b gcd(a,b) = gcd(b, remainder of a/b)
        if(b == 0){
            return a;
        }
        else{
            return gcdlcm(b, a%b); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int gcd = gcdlcm(a, b);
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + a*b/gcd);

        sc.close();
    }
}