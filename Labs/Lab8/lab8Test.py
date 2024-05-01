import unittest

from lab8 import *
class MyTestCase(unittest.TestCase):
    def test_something(self):
        self.assertEqual(3, lab8.coinChange({1, 2, 5}, 11))  # add assertion here
        self.assertEqual(-1, lab8.coinChange({2}, 3))
        self.assertEqual(0, lab8.coinChange({1}, 0))

