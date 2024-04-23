import random
import classes
import neuNetMain
# Constants
e = 2.71828

# Variables
ram = []

# Equations
def S(x):
    return 1 / (1 + e ** -x)
def dSdx(x):
    return S(x) * (1 - S(x))
# Methods
def weightedSum(x, w, bias, layersize):
    t = 0
    for i in range(0, 5):
        t = t + (x[i] * w[i])
    t = t + bias

def randList(length, lower, upper):
    for i in range(length):
        ram.append(random.uniform(lower, upper))
    return ram


