from idlelib.tree import TreeNode
from typing import Optional

class Helper:
    def helpLevelOrder(self, root: Optional[TreeNode], lst, count):
        if len(lst) < count:
            lst.append([])
        lst[count - 1].append(root.val)
        if (root.left is not None):
            lst = Helper.helpLevelOrder(self, root.left, lst, count + 1)
        if (root.right is not None):
            lst = Helper.helpLevelOrder(self, root.right, lst, count + 1)
        return lst

class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

    def levelOrder(self, root: Optional[TreeNode]) -> list[list[int]]:
        #HW 10
        if root is None: return None
        count = 1
        returnList = []
        returnList.append([root.val])

        if (root.left is not None):
            returnList = Helper.helpLevelOrder(self, root.left, returnList, count + 1)
        if (root.right is not None):
            returnList = Helper.helpLevelOrder(self, root.right, returnList, count + 1)
        return returnList



    


