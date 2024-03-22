import unittest
from TreeNode import *

class MyTestCase(unittest.TestCase):
    def test_HW9Test(self):
        t = TreeNode(4)
        t.left = TreeNode(3)
        t.left.left = TreeNode(1)
        t.right = TreeNode(8)
        t.right.left = TreeNode(5)
        t.right.right = TreeNode(9)
        self.assertEqual(t.left, TreeNode.lowestCommonAncestor(t, t, t.left, t.left.left))
        self.assertEqual(t, TreeNode.lowestCommonAncestor(t, t, t.left.left, t.right.right))
        self.assertEqual(t, TreeNode.lowestCommonAncestor(t, t, t.right.left, t.left))
        self.assertEqual(t.right, TreeNode.lowestCommonAncestor(t, t, t.right.left, t.right.right))
        t.right.right.right = TreeNode(11)
        t.right.right.right.left = TreeNode(10)
        t.right.right.right.right = TreeNode(12)
        self.assertEqual(t.right.right.right,
                         TreeNode.lowestCommonAncestor(t,
                                                       t,
                                                       t.right.right.right.left,
                                                       t.right.right.right.right))


if __name__ == '__main__':
    unittest.main()
