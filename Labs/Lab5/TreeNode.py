class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


    def isValidBST(self, root): #lab5
        if root is None: return True
        if root.left is not None:
            if root.val < root.left.val:return False
        if root.right is not None:
            if root.val > root.right.val:return False
        return self.isValidBST(root.left) and self.isValidBST(root.right)
