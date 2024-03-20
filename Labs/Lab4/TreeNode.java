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
    public static TreeNode invertTree(TreeNode root) { //lab4
        if (root == null) {
            return root;
        }
        if (root.left != null) { //dfs traversal
            invertTree(root.left);
            if (root.right != null) {
                invertTree(root.right);
            }
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        return root;
    }
}