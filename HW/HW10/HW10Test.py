import unittest
from TreeNode import *

class MyTestCase(unittest.TestCase):
    def test_HW10(self):
        t = TreeNode(4)
        t.left = TreeNode(3)
        t.left.left = TreeNode(1)
        t.right = TreeNode(8)
        t.right.left = TreeNode(5)
        t.right.right = TreeNode(9)

        test = TreeNode.levelOrder(self, t)
        print(test)

        t1 = None
        test = TreeNode.levelOrder(self, t1)
        print(test)


if __name__ == '__main__':
    unittest.main()
