import org.junit.Test;

import static org.junit.Assert.*;

public class hw11Test {
    @Test
    public void test() {
        int[][] img = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };

        hw11.floodfill(img, 1, 1, 2);
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                System.out.print(img[i][j] + " ");
            }
            System.out.println();
        }

        int[][] img2 = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        hw11.floodfill(img2, 0, 0, 0);
        System.out.println();

        for (int i = 0; i < img2.length; i++) {
            for (int j = 0; j < img2[0].length; j++) {
                System.out.print(img2[i][j] + " ");
            }
            System.out.println();
        }

    }

}