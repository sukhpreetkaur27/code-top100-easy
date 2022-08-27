package com.code.top100.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * You can return the answer in any order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [2,7,11,15], target = 9<br>
 * Output: [0,1]<br>
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Example 2:
 * 
 * Input: nums = [3,2,4], target = 6<br>
 * Output: [1,2]
 * 
 * Example 3:
 * 
 * Input: nums = [3,3], target = 6<br>
 * Output: [0,1]
 * 
 * 
 * Constraints:
 * 
 * 2 <= nums.length <= 10^4<br>
 * -10^9 <= nums[i] <= 10^9<br>
 * -10^9 <= target <= 10^9<br>
 * Only one valid answer exists.
 * @author sukh
 *
 */

public class TwoSum {

  public static void main(String[] args) {
    int[] nums = new int[] { 2, 7, 11, 15 };
    int target = 9;
    int[] indices = twoSum(nums, target);
    Arrays.stream(indices).forEach(System.out::println);
  }

  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numIndexMap = new HashMap<>();
    int complement;
    for (int i = 0; i < nums.length; i++) {
      complement = target - nums[i];
      if (numIndexMap.containsKey(complement)) {
        return new int[] { i, numIndexMap.get(complement) };
      }
      numIndexMap.put(nums[i], i);
    }
    return null;
  }

}

/**
 * Solution:
 * 
 * Approach 3: One-pass Hash Table
 * 
 * To improve our runtime complexity, we need a more efficient way to check if
 * the complement exists in the array. If the complement exists, we need to get
 * its index. What is the best way to maintain a mapping of each element in the
 * array to its index? A hash table.
 * 
 * We can reduce the lookup time from O(n)O(n) to O(1)O(1) by trading space for
 * speed. A hash table is well suited for this purpose because it supports fast
 * lookup in near constant time. I say "near" because if a collision occurred, a
 * lookup could degenerate to O(n)O(n) time. However, lookup in a hash table
 * should be amortized O(1)O(1) time as long as the hash function was chosen
 * carefully.
 * 
 * Complexity Analysis:
 * 
 * Time complexity: O(n)O(n). We traverse the list containing nn elements only
 * once. Each lookup in the table costs only O(1)O(1) time.
 * 
 * Space complexity: O(n)O(n). The extra space required depends on the number of
 * items stored in the hash table, which stores at most nn elements.
 */
