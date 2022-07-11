/*
An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.
You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].
To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with color.
Return the modified image after performing the flood fill.
*/

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        floodFill(image,sr,sc,color,new boolean[image.length][image[0].length],image[sr][sc]);
        return image;
    }
    private void floodFill(int[][] image,int sr,int sc,int color,boolean[][] visited,int cur) {
        if(sr>=image.length || sr<0 || sc<0 || sc>=image[0].length || image[sr][sc]!=cur || visited[sr][sc])
            return;
        image[sr][sc] = color;
        visited[sr][sc] = true;
        floodFill(image,sr-1,sc,color,visited,cur);
        floodFill(image,sr,sc-1,color,visited,cur);
        floodFill(image,sr,sc+1,color,visited,cur);
        floodFill(image,sr+1,sc,color,visited,cur);
    }
}