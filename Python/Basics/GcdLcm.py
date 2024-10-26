# 1. Write a program to find the GCD of two numbers using the Euclidean algorithm.

# Input: a = 12, b = 18
# Output: 6
# 2. Write a program to calculate the Least Common Multiple (LCM) of two numbers.

# Input: a = 4, b = 6
# Output: 12

def gcdlcm(a, b):
    if b == 0:
        return a
    else:
        return gcdlcm(b, a%b)

a = int(input("Enter num1: "))
b = int(input("Enter num2: "))

print("GCD: ", gcdlcm(a, b))
print("LCM: ", int(a*b/gcdlcm(a, b)))