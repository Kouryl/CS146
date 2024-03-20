import org.junit.Test;

import static org.junit.Assert.*;

public class Lab5Test {

    @Test
    public void test1() {
        TreeNode t = new TreeNode(4);
        t.left = new TreeNode(3);
        t.left.left = new TreeNode(1);
        t.right = new TreeNode(8);
        t.right.left = new TreeNode(5);
        t.right.right = new TreeNode(9);
        assertEquals(true, TreeNode.isValidBST(t));
    }
    @Test
    public void test2() {
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.left.left = new TreeNode(3);
        t.left.right = new TreeNode(4);
        t.right = new TreeNode(8);
        t.right.left = new TreeNode(5);
        t.right.right = new TreeNode(6);
        assertEquals(false, TreeNode.isValidBST(t));
    }
}