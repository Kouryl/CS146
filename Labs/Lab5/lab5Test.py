import unittest
from TreeNode import *

class MyTestCase(unittest.TestCase):
    def test_lab5(self):
        t = TreeNode(4)
        t.left = TreeNode(3)
        t.left.left = TreeNode(1)
        t.right = TreeNode(8)
        t.right.left = TreeNode(5)
        t.right.right = TreeNode(9)
        self.assertEqual(True, t.isValidBST(t))


if __name__ == '__main__':
    unittest.main()
