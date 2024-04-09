import unittest
from hw11 import *

class MyTestCase(unittest.TestCase):
    def test_something(self):
        img = [[1, 1, 1],
               [1, 1, 0],
               [1, 0, 1]]
        hw11Util.floodFill(self, img, 1, 1, 2)

        for i in range(len(img)):
            for j in range(len(img[0])):
                print(str(img[i][j]), end = " ")
            print()

        img = [[0, 0, 0],
               [0, 0, 0],
               [0, 0, 0]]
        hw11Util.floodFill(self, img, 0, 0, 0)
        print()

        for i in range(len(img)):
            for j in range(len(img[0])):
                print(str(img[i][j]), end=" ")
            print()


if __name__ == '__main__':
    unittest.main()
