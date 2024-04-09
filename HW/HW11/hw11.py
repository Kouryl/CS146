class hw11Util:
    def floodFill(self, image, sr, sc, color):
        if (image[sr][sc] == color): return image
        prevColor = image[sr][sc]
        image[sr][sc] = color
        if (sc - 1 >= 0 and image[sr][sc - 1] == prevColor):
            image = hw11Util.floodFill(self, image, sr, sc - 1, color)
        if (sr - 1 >= 0 and image[sr - 1][sc] == prevColor):
            image = hw11Util.floodFill(self, image, sr - 1, sc, color)
        if (sc + 1 < len(image[0]) and image[sr][sc + 1] == prevColor):
            image = hw11Util.floodFill(self, image, sr, sc + 1, color)
        if (sr + 1 < len(image) and image[sr + 1][sc] == prevColor):
            image = hw11Util.floodFill(self, image, sr + 1, sc, color)
        return image
