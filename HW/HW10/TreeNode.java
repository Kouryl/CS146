import java.util.ArrayList;
import java.util.List;

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

    public static List<List<Integer>> levelOrder(TreeNode root) { //hw 10
        if (root == null) return null;
        int count = 1;
        List<List<Integer>> returnList = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();

        tmp.add(root.val);
        returnList.add(tmp);

        if (root.left != null) {
            returnList = helpLevelOrder(root.left, returnList, count + 1);
        }
        if (root.right != null) {
            returnList = helpLevelOrder(root.right, returnList, count + 1);
        }
        return returnList;
    }

    private static List<List<Integer>> helpLevelOrder(TreeNode root, List<List<Integer>> lst, int count) {
        //uses dfs
        if (lst.size() < count) { //add new list for level if it doesn't exist yet.
            lst.add(count-1, new ArrayList<>());
        }
        lst.get(count - 1).add(root.val);

        if (root.left != null) { //going left
            lst = helpLevelOrder(root.left, lst, count + 1);
        }
        if (root.right != null) { //going right
            lst = helpLevelOrder(root.right, lst, count + 1);
        }
        return lst;
    }
}