# Create two arrays: x = np.array([1, 2, 3]) and y = np.array([4, 5, 6]). Concatenate them into a single array and then split the resulting array into two equal parts.

import numpy as np

x = np.array([1,2,3])
y = np.array([4,5,6])

concate = np.concatenate((x,y))
splitArr = np.array_split(concate,2)

print(concate)
print(splitArr)