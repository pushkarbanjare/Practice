# Write a program to count the number of vowels in a given string.

# Input: str = "hello"
# Output: 2 (because 'e' and 'o' are vowels)

def countVow(str):
    vowels = "aeiouAEIOU"
    count = 0
    for char in str:
        if char in vowels:
            count += 1
    return count
inputstr = input("Enter a string: ")
print(countVow(inputstr))