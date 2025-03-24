package ScrollWindow;
// 题目链接: https://leetcode.cn/problems/max-consecutive-ones-iii/
// 题目类型: 滑动窗口03
// 题目解答:
//class Solution {
//    public int longestOnes(int[] nums, int k) {
//        int n = nums.length, left = 0, right = 0, count = 0, result = 0;
//        while(right<n){
//            if(nums[right] == 0){
//                count++;
//            }
//            while(count>k){
//                if(nums[left]==0){
//                    count--;
//                }
//                left++;
//            }
//            result = Math.max(result, (right-left+1));
//            right++;
//        }
//        return result;
//    }
//}
public class 最大连续1的个数03 {
}
