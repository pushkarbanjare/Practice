# Write a program to reverse the digits of a given number.

# Input: n = 1234
# Output: 4321

def rev(n):
    rev = 0
    while n>0:
        rem = n%10
        rev = (rev*10) + rem
        n //= 10 # need to use this
    return rev
num = int(input("Enter a number: "))
print(rev(num))