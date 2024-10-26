# Write a program to check whether a given year is a leap year or not.

# Input: year = 2020
# Output: 2020 is a leap year

x = int(input("Enter a year: "))
if (x%4 == 0 and x%100 != 0) or x%400 == 0:
    print("Leap year")
else:
    print("Not a leap year")