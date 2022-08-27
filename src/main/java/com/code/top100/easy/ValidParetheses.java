package com.code.top100.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

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
    String s = "(]";
  }

  public boolean isValid(String s) {
    Map<Character, Character> openCloseParanthesesMap = new HashMap<>();
    openCloseParanthesesMap.put('(', ')');
    openCloseParanthesesMap.put('{', '}');
    openCloseParanthesesMap.put('[', ']');

    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      if (openCloseParanthesesMap.containsKey(ch)) {

      }
    }

    return true;
  }

  /**
   * If you need a stack, use an ArrayDeque instead.
   */
}
