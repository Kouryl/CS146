public class hw11 {
    public static int[][] floodfill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) { return image; }
        int prevColor = image[sr][sc]; //save old color for comparison
        image[sr][sc] = color; //set new color
        if (sc - 1 >= 0 && image[sr][sc - 1] == prevColor) { //left
            image = floodfill(image, sr, sc - 1, color);
        }
        if (sr - 1 >= 0 && image[sr - 1][sc] == prevColor) { //up
            image = floodfill(image, sr - 1, sc, color);
        }
        if (sc + 1 < image[0].length && image[sr][sc + 1] == prevColor) { //right
            image = floodfill(image, sr, sc + 1, color);
        }
        if (sr + 1 < image.length && image[sr + 1][sc] == prevColor) { //down
            image = floodfill(image, sr + 1, sc, color);
        }
        return image;
    }
}
