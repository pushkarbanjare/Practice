// Write a program to calculate the sum of the first n natural numbers.

// Input: n = 5
// Output: 15 (because 1 + 2 + 3 + 4 + 5 = 15)

import java.util.Scanner;

public class SumOfNaturalNo {
    public static int sumNatNo(int n){
        return n*(n+1)/2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(sumNatNo(n));

        sc.close();
    }
}