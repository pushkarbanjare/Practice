# Given a 5x5 matrix of random integers from 0 to 100, set all elements greater than 50 to 50 and all elements less than 10 to 10 using masking.

import numpy as np

matrix = np.random.randint(0,101, (5,5))
matrix[matrix>50] = 50
matrix[matrix<10] = 10

print(matrix)