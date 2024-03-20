public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static boolean isValidBST(TreeNode root) { //lab5
        if (root == null) {
            return true;
        }
        if (root.left != null) {
            if (root.val < root.left.val) {
                return false;
            }
        }
        if (root.right != null) {
            if (root.val > root.right.val) {
                return false;
            }
        }
        return (isValidBST(root.left) && isValidBST(root.right));
    }
}