import unittest

from lab6 import *
class MyTestCase(unittest.TestCase):
    def test_something(self):
        test = [[1,0]]
        self.assertEqual(True, canFinish(2, test))  # add assertion here
        self.assertEqual(False, canFinish(2, [[1,0],[0,1]]))
        self.assertEqual(False, canFinish(4, [[1,0],[2,1],[3,2],[0,3]]))
        self.assertEqual(False, canFinish(4, [[0,1],[1,2],[2,3],[3,0]]))



if __name__ == '__main__':
    unittest.main()
