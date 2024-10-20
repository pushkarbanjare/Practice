// Write a program to check whether a given year is a leap year or not.

// Input: year = 2020
// Output: 2020 is a leap year

import java.util.Scanner;

public class LeapYear {
    public static void leapyr(int n){
        if((n%4 == 0 && n%100 == 0) || n%400 == 0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a Leap year");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int n = sc.nextInt();
        leapyr(n);
        sc.close();
    }
}