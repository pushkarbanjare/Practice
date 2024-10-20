// Write a program to count the number of vowels in a given string.

// Input: str = "hello"
// Output: 2 (because 'e' and 'o' are vowels)

import java.util.Scanner;

public class CountVowel {
    public static int vowelC(String str){
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println(vowelC(input));
        sc.close();
    }
}