import org.junit.Test;

import static org.junit.Assert.*;

public class Lab4Test {
    @Test
    public void test1() {
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.left.left = new TreeNode(3);
        t.left.right = new TreeNode(4);
        t.right = new TreeNode(8);
        t.right.left = new TreeNode(5);
        t.right.right = new TreeNode(6);

        TreeNode.invertTree(t);

        assertEquals(1, t.val);
        assertEquals(8, t.left.val);
        assertEquals(6, t.left.left.val);
        assertEquals(5, t.left.right.val);
        assertEquals(2, t.right.val);
        assertEquals(4, t.right.left.val);
        assertEquals(3, t.right.right.val);
    }
}