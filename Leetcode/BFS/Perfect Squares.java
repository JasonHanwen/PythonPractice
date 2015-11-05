
/**


*/


/**
Author:Hanwen Wang
Version:1
Last Updated: 2015/11/3
*/

/*
class:BFS
https://leetcode.com/problems/number-of-islands/
/*
Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.

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

import java.util.*;

public class Solution {
    List<Integer> result = new List<Integer>();
    public int numSquares(int n) {
      int i = 1;
      int sum = 0;
      int num = 0;
      help(i,n,sum,num);
      //here is to find the minimun value of these squared int the list
      int min = Math.MaxValue();
      Iterator<Integer> iterator= new result.Iterator;
      while(iterator.hasNext()){
          int tem = (Integer) iterator.next();
          if(tem < min)
          min = tem;
      }
      return min;
    }

    public void help(int i, int target, int sum, int number){
      if(taget == sum){
        List.add(number)
        return;
      }
      else if(target > sum){
        return
      }
      for(int j = i; (sum + Math.pow(i, 2)) <= target; j++){
        help(j,target, sum + Math.pow(i, 2), number+1);
      }
    }
}
