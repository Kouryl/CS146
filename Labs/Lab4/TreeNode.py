class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

    def invertTree(self, root): #lab4
        if root is None:
            return root
        if root.left is not None:
            self.invertTree(root.left)
            if root.right is not None:
                self.invertTree(root.right)
        tmp = root.left
        root.left = root.right
        root.right = tmp
        return root

