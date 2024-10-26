# Create a 1D array of random integers from 1 to 20 and select only the elements that are divisible by 3.

import numpy as np

arr = np.random.randint(1,21, size=10)
divBy3 = arr[arr%3 == 0]
print(divBy3)