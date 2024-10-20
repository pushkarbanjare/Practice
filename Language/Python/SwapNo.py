# Write a program to swap two numbers without using a third (temporary) variable.

# Input: a = 5, b = 10
# Output: a = 10, b = 5

a = int(input("Enter num1: "))
b = int(input("Enter num2: "))

print("Before swap: num1 =",a,", num2 = ", b)

a = a+b
b = a-b
a = a-b

print("After swap: num1 =",a,", num2 = ", b)