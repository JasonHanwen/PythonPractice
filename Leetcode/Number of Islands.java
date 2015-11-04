/**
Author:Hanwen Wang
Version:1
Last Updated: 2015/11/3
*/

/*
class:Union Find
https://leetcode.com/problems/number-of-islands/
/*
Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

11110
11010
11000
00000
Answer: 1

11000
11000
00100
00011
Answer: 3
*/
//this is to detect how many objects in this image
public class Solution {
    public int numIslands(char[][] grid) {
      if(board == null || board.length == 0)
           return
      rowLeng = board.length();
      columnLeng = board[0].length();

      int global = 0;
      for(int i = 0; i < rowLeng; i++){
        for(int j = 0; j < colmnLeng; j++){

          //we set the value to -1 to distinguish with 1
          if(board[i][j] == '1'){
              global ++;
              if(global == 1)
              char tem;
              board[i][j] == 1? char((-1) * global), char(global);
              merge(board, i, j,tem);
          }
          //this is to meet some part that not 1, 0, or other value
          else
              continue;
          return global;
        }
      }
      public void merge(char[][] grid, int i, int j,char tem){
        board[i][i] = tem;
        if(i > 0 && board[i - 1][j] == '1')
            merge(board, i - 1,j);
        if(i < columnLeng - 1 && board[i + 1][j] == '1')
            merge(board, i + 1,j);
        if(j > 0 && board[i][j - 1] == '1')
            merge(board, i ,j - 1);
        if(j < rowLeng - 1 && board[i][j + 1] == '1')
            merge(board, i ,j + 1);
      }
    }
}
