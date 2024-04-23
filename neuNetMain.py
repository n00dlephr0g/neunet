import math
import string
import re
import random
import func


# variables, lists and more
values = {
    0 : [],
    1 : [],
    2 : [],
    3 : []
    }   
layers = 3
weights = {
    0 : {},
    1 : {}
    }

values[0] = func.randList(2, 0, 1)
weights[0][0] = func.randlist()


func.S(5)



# classes
# class Neurons:
#     def __init__(self, iteration, layer):
#         self.node = iteration
#         self.layer = layer
#     def queryLayerP(self):
#         Neurons.layer = self.layer - 1

# Neurons.growNeurons(4, 0)
# print()

