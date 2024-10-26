# Create a 3x3 matrix with values ranging from 1 to 9, and extract the second row and the last column.

import numpy as np

matrix = np.arange(1,10).reshape(3,3)
secRow = matrix[1,:]
lastCol = matrix[:,-1]

print(matrix)
print(secRow)
print(lastCol)