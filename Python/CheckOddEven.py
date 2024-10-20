# Write a program to check if a given number is odd or even.

# Input: n = 7
# Output: 7 is an odd number

def checkOE(n):
    if n%2==0:
        print("Even")
    else:
        print("Odd")

n = int(input("Enter a  number: "))
checkOE(n)