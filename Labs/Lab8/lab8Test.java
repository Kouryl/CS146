import org.junit.Test;

import static org.junit.Assert.*;

public class lab8Test {
    @Test
    public void test() {
        assertEquals(3, lab8.coinChange(new int[]{1, 2, 5}, 11));
        assertEquals(-1, lab8.coinChange(new int[]{2}, 3));
        assertEquals(0, lab8.coinChange(new int[]{1}, 0));
    }

}