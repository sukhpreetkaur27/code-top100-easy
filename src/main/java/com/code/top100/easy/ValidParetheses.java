package com.code.top100.easy;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * Open brackets must be closed by the same type of brackets. Open brackets must
 * be closed in the correct order.
 * 
 * 
 * Example 1:
 * 
 * Input: s = "()"<br>
 * Output: true<br>
 * 
 * Example 2:
 * 
 * Input: s = "()[]{}"<br>
 * Output: true<br>
 * 
 * Example 3:
 * 
 * Input: s = "(]"<br>
 * Output: false
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 104<br>
 * s consists of parentheses only '()[]{}'.
 * @author sukh
 *
 */

public class ValidParetheses {

  public static void main(String[] args) {
    String s = "(){}}{";
    System.out.println(isValid(s));
  }

  public static boolean isValid(String s) {
    boolean flag = false;
    
    ArrayDeque<Character> stack = new ArrayDeque<>();
    Map<Character, Character> closeOpenmap = new HashMap<>();
    closeOpenmap.put(')', '(');
    closeOpenmap.put('}', '{');
    closeOpenmap.put(']', '[');

    char ch;
    char pop_val;
    for (int i = 0; i < s.length(); i++) {
      ch = s.charAt(i);
      if (!closeOpenmap.containsKey(ch)) {
        // Push the open parentheses
        stack.push(ch);
      } else {
        // Validate closing parentheses
        if (stack.isEmpty()) {
          flag = false;
          break;
        } else {
          pop_val = stack.pop();
          if (closeOpenmap.get(ch) == pop_val) {
            flag = true;
            continue;
          } else {
            flag = false;
            break;
          }
        }
      }
    }

    if (!stack.isEmpty()) {
      flag = false;
    }
    return flag;
  }

  /**
   * If you need a stack, use an ArrayDeque instead.
   */
}
