# Write a program to check if two strings are anagrams of each other.

# Input: str1 = "listen", str2 = "silent"
# Output: They are anagrams

def anagram(str1, str2):
    str1 = str1.replace(" ", "").lower()
    str2 = str2.replace(" ", "").lower()
    return sorted(str1) == sorted(str2)

str1 = input("Enter string1: ")
str2 = input("Enter string2: ")

if anagram(str1, str2):
    print("Anagram")
else:
    print("Not Anagram")