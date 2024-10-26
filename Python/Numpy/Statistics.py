# Generate a 4x4 matrix with random values and find the mean, median, variance, and standard deviation of the entire matrix.

import numpy as np

randomMatrix = np.random.rand(4,4)
mean = np.mean(randomMatrix)
median = np.median(randomMatrix)
variance = np.var(randomMatrix)
stdDeviation = np.std(randomMatrix)

print(mean)
print(median)
print(variance)
print(stdDeviation)