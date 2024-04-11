import unittest

from lab6 import *
class MyTestCase(unittest.TestCase):
    def test_something(self):
        test = [[1,0]]
        self.assertEqual(True, canFinish(2, test))  # add assertion here
        self.assertEqual(False, canFinish(2, [[1,0],[0,1]]))


if __name__ == '__main__':
    unittest.main()
