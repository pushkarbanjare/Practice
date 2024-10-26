// Write a program to check whether a number is an Armstrong number or not.

// Input: n = 153
// Output: 153 is an Armstrong number

import java.util.Scanner;

public class ArmstrongNo {
    public static void armNo(int n) {
        int original = n;
        int arm = 0;
        int rem;
        while (n>0) {
            rem = n%10;
            arm = arm + (rem*rem*rem);
            n = n/10;
        }

        if (original == arm) {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        armNo(n);
        sc.close();
    }
}
