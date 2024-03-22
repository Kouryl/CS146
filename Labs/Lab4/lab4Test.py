import unittest
from TreeNode import *

class MyTestCase(unittest.TestCase):
    def test_lab4(self):
        t = TreeNode(1)
        t.left = TreeNode(2)
        t.left.left = TreeNode(3)
        t.left.right = TreeNode(4)
        t.right = TreeNode(8)
        t.right.left = TreeNode(5)
        t.right.right = TreeNode(6)

        t.invertTree(t)

        self.assertEqual(1, t.val)
        self.assertEqual(8, t.left.val)
        self.assertEqual(6, t.left.left.val)
        self.assertEqual(5, t.left.right.val)
        self.assertEqual(2, t.right.val)
        self.assertEqual(4, t.right.left.val)
        self.assertEqual(3, t.right.right.val)



if __name__ == '__main__':
    unittest.main()
