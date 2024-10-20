// Write a program to check whether a given number is prime or not.

// Input: n = 7
// Output: 7 is a prime number

import java.util.Scanner;

public class PrimeNo {
    public static boolean checkPrime(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (checkPrime(n)) {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
        sc.close();        
    }
}