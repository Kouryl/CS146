import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class HW10Test {
    @Test
    public void test() {
        TreeNode t = new TreeNode(4);
        t.left = new TreeNode(3);
        t.left.left = new TreeNode(1);
        t.right = new TreeNode(8);
        t.right.left = new TreeNode(5);
        t.right.right = new TreeNode(9);
        List<List<Integer>> test = new ArrayList<>();
        test = TreeNode.levelOrder(t);
        System.out.println(test);

        TreeNode t1 = null;
        test = TreeNode.levelOrder(t1);
        System.out.println(test);
    }
}
