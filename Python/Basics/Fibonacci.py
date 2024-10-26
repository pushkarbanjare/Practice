# Write a program to generate the Fibonacci series up to n terms.

# Input: n = 5
# Output: 0 1 1 2 3

def fibonacci(n):
    if n<=1:
        return n
    return fibonacci(n-1) + fibonacci(n-2)

n = int(input("Enter a number: "))
for i in range(n):
    print(fibonacci(i), end=" ")