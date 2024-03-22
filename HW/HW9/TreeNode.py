class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        ancestor = root
        if p.val < root.val and q.val < root.val:
            ancestor = self.lowestCommonAncestor(root.left, p, q)
        elif p.val > root.val and q.val > root.val:
            ancestor = self.lowestCommonAncestor(root.right, p, q)
        return ancestor