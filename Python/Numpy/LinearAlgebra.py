# Given two 2x2 matrices, A = np.array([[1, 2], [3, 4]]) and B = np.array([[5, 6], [7, 8]]), calculate their matrix product and the determinant of matrix A.

import numpy as np

A = np.array([[1,2], [3,4]])
B = np.array([[5,6], [7,8]])

matrixProduct = np.dot(A,B) 
determinantA = np.linalg.det(A)
determinantB = np.linalg.det(B)

print(matrixProduct)
print(determinantA)
print(determinantB)