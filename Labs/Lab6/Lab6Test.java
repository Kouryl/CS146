import org.junit.Test;

import static org.junit.Assert.*;

public class Lab6Test {

    @Test
    public void test() {
        int [][] test = {{1,0}};
        assertEquals(true, Lab6.canFinish(2, test));
        int[][] test1 = {{1,0},{0,1}};
        assertEquals(false, Lab6.canFinish(2, test1));
        int[][] test2 = {{1,0}, {2,0}, {0,1}};
        assertEquals(false, Lab6.canFinish(3, test2));
        int[][] test3 = {{1,0}, {2,0}};
        assertEquals(true, Lab6.canFinish(3, test3));
        int[][] test4 = {{1,0}, {2,1}, {3,2}};
        assertEquals(true, Lab6.canFinish(4, test4));
        int[][] test5 = {{1,0}, {2,1}, {3,2}, {2, 3}};
        assertEquals(false, Lab6.canFinish(4, test5));
        int[][] test6 = {{0,1}, {1,2}, {2,3}, {3,0}};
        assertEquals(false, Lab6.canFinish(4, test6));
    }
}