import java.util.*;

//I need to record which one should be removed
public class Solution {
    public List<String> removeInvalidParentheses(String s) {
      int length = s.length();
      //this is to record  the left character number that need to be deleted
      int left = 0;
      //this is to record  the right character number that need to be deleted
      int right = 0;

      Stack<Integer>leftIndex = new Stack<Integer>();
      Stack<Integer>rightIndex = new Stack<Integer>();

      //I use 0 to represent '(' and 1 to represent')'
      Stack<char>leftChar = new Stack<char>();
      Stack<char>rightChar = new Stack<char>();

      //this is to iterate from left to right
      for(int i = 0; i < length; i++)
      {
          if(s.CharAt(i) == '('){
              leftIndex.push(i);  //record the index of the char
              leftChar.push('(');
          }
          else if(s.CharAt(i) == ')'){
              if(!leftChar.empty() && leftChar.peak() == '('){
                  leftChar.pop();
                  leftIndex.pop();
              }
              else{
                leftIndex.push(i);  //record the index of the char
                leftChar.push(')');
              }
          }
          //this is to tackle with other parameter, do noting
          else{
            // do nothing
          }
      }

      //this is to tackle with right condition
      for(int i = length - 1; i >= 0; i--)
      {
          if(s.CharAt(i) == ')'){
              leftIndex.push(i);  //record the index of the char
              leftChar.push(')');
          }
          else if(s.CharAt(i) == '('){
              if(!leftChar.empty() && leftChar.peak() == ')'){
                  leftChar.pop();
                  leftIndex.pop();
              }
              else{
                leftIndex.push(i);  //record the index of the char
                leftChar.push('(');
              }
          }
          //this is to tackle with other parameter, do noting
          else{
            // do nothing
          }
      }

      //how to compute the right String
      //this is to compute the number of char left in leftStack
      while(!leftIndex.empty()){
          int index = (Integer)leftIndex.pop();
          left++;
      }
      while(!rightIndex.empty()){
          int index = (Integer)rightIndex.pop();
          right++;
      }
      return Math.min(left,right);

      //need to konw how to get the right String
    }
}
