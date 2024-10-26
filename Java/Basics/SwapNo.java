// Write a program to swap two numbers without using a third (temporary) variable.

// Input: a = 5, b = 10
// Output: a = 10, b = 5

import java.util.Scanner;

public class SwapNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Original a: " + a);
        System.out.println("Original b: " + b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Swapped a: " + a);
        System.out.println("Swapped b: " + b);

        sc.close();
    }
}