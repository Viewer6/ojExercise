package ScrollWindow;

// 题目链接: https://leetcode.cn/problems/longest-substring-without-repeating-characters/description/
// 题目类型: 滑动窗口02
// 题目解答:
//class Solution {
//    public int lengthOfLongestSubstring(String ss) {
//        char[] s = ss.toCharArray();
//
//        int[] hash = new int[128];
//        int n = ss.length(), left = 0, right = 0, result = 0;
//        while(right<n){
//            hash[s[right]]++;
//            while(hash[s[right]]>1){
//                hash[s[left]]--;
//                left++;
//            }
//            result = Math.max(result, (right-left+1));
//            right++;
//        }
//
//        return result;
//    }
//}
public class 无重复字符串的最长子串02 {
}
