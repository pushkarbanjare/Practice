// Write a program to check if two strings are anagrams of each other.

// Input: str1 = "listen", str2 = "silent"
// Output: They are anagrams

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean anagram(String str1, String str2){
        // remove spaces and lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if(str1.length() != str2.length()){
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(anagram(str1, str2));

        sc.close();
    }
}