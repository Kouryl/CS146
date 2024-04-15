import unittest

from hw12 import *
class MyTestCase(unittest.TestCase):
    def test_something(self):
        self.assertEqual(2,hw12.minCostToSupplyWater(self, 3, [1,1], [[1,2,1],[1,2,2]]))
        self.assertEqual(3, hw12.minCostToSupplyWater(self, 3, [2,1,1], [[1,2,1],[1,3,1],[2,3,2]]))


if __name__ == '__main__':
    unittest.main()
