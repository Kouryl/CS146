import org.junit.Test;

import static org.junit.Assert.*;

public class Lab6Test {

    @Test
    public void test() {
        int [][] test = {{1,0}};
        assertEquals(true, Lab6.canFinish(2, test));
        int[][] test1 = {{1,0},{0,1}};
        assertEquals(false, Lab6.canFinish(2, test1));
    }
}