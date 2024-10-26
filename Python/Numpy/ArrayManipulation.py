# Create an 8x8 matrix and fill it with a checkerboard pattern (alternating 0s and 1s, starting with 0 at the top left).

import numpy as np

checkerboard = np.zeros((8, 8), dtype=int)
checkerboard[1::2, ::2] = 1 
checkerboard[::2, 1::2] = 1

print(checkerboard)