# 1. Write a program to print a right-angle triangle pattern of stars.

# Input: n = 5
# Output:
# *
# **
# ***
# ****
# *****

# 2. Write a program to print a pyramid pattern.

# Input: n = 5
# Output:
#     *
#    ***
#   *****
#  *******
# *********


def pattern1(n):
    for i in range(n):
        for j in range(i+1):
            print("*", end=" ")
        print()

def pattern2(n):
    for i in range(n):
        print(" " * (n-i-1), end=" ")
        print("*" * (2*i+1))

pattern1(5)
pattern2(5)