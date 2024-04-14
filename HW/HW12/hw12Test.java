import org.junit.Test;

import static org.junit.Assert.*;

public class hw12Test {
    @Test
    public void test() {
        int[][] pipes = {{1,2,1}, {1,2,2}};
        int[] wells = {1,1};
        assertEquals(2, hw12.minCostToSupplyWater(2, wells, pipes));

        int[][] pipes2 = {{1,2,1}, {1,3,1}, {2,3,2}};
        int[] wells2 = {2,1,1};
        assertEquals(3, hw12.minCostToSupplyWater(3, wells2, pipes2));
    }

}