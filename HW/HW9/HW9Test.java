import org.junit.Test;

import static org.junit.Assert.*;

public class HW9Test {
    @Test
    public void test() {
        TreeNode t = new TreeNode(4);
        t.left = new TreeNode(3);
        t.left.left = new TreeNode(1);
        t.right = new TreeNode(8);
        t.right.left = new TreeNode(5);
        t.right.right = new TreeNode(9);
        assertEquals(t.left, TreeNode.lowestCommonAncestor(t, t.left, t.left.left));
        assertEquals(t, TreeNode.lowestCommonAncestor(t, t.left.left, t.right.right));
        assertEquals(t, TreeNode.lowestCommonAncestor(t, t.right.left, t.left));
        assertEquals(t.right, TreeNode.lowestCommonAncestor(t, t.right.left, t.right.right));
        //larger tree tests below
        t.right.right.right = new TreeNode(11);
        t.right.right.right.left = new TreeNode(10);
        t.right.right.right.right = new TreeNode(12);
        assertEquals(t.right.right.right,
                TreeNode.lowestCommonAncestor(t, t.right.right.right.left, t.right.right.right.right));
    }
}