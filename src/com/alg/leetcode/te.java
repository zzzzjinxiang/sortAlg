package com.alg.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class te {
    public static void main(String[] args){
        int[][] test = new int[][]{
                {1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}
        };
        int[][] test1 = {};
        for(int[] x:pacificAtlantic(test1)){
            for(int y:x)
                System.out.print(y+" ");
            System.out.println();
        }

    }
    public static List<int[]> pacificAtlantic(int[][] matrix) {
        List<int[]> res = new ArrayList<>();
        if(matrix==null||matrix.length==0)
            return res;
        boolean[][] flag = new boolean[matrix.length][matrix[0].length];
        boolean[][] flag1 = new boolean[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            dfs(matrix,flag,i,0);
            dfs(matrix,flag1,i,matrix[0].length-1);
        }
        for(int i=0;i<matrix[0].length;i++){
            dfs(matrix,flag,0,i);
            dfs(matrix,flag1,matrix.length-1,i);
        }
        for(int x=0;x<matrix.length;x++){
            for(int y=0;y<matrix[0].length;y++){
                if(flag[x][y]&&flag1[x][y])
                    res.add(new int[]{x,y});
            }
        }
        return res;
    }

    private static void dfs(int[][] matrix,boolean[][] flag,int row,int col){
        if(flag[row][col])
            return;
        flag[row][col] = true;
        if(row>0&&matrix[row-1][col]<=matrix[row][col]&&!flag[row-1][col])
            dfs(matrix,flag,row-1,col);
        if(row<matrix.length-1&&matrix[row+1][col]<=matrix[row][col]&&!flag[row+1][col])
            dfs(matrix,flag,row+1,col);
        if(col>0&&matrix[row][col-1]<=matrix[row][col]&&!flag[row][col-1])
            dfs(matrix,flag,row,col-1);
        if(col<matrix[0].length-1&&matrix[row][col+1]<=matrix[row][col]&&!flag[row][col+1])
            dfs(matrix,flag,row,col+1);
    }
}
