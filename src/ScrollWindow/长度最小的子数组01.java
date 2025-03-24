package ScrollWindow;

// 题目链接: https://leetcode.cn/problems/minimum-size-subarray-sum/description/
// 题目类型: 滑动窗口01
// 题目解答:
//class Solution {
//    public int minSubArrayLen(int target, int[] nums) {
//        int n = nums.length, count = 0, result = 0;
//        for(int left = 0, right = 0; right<n; right++){
//            count+=nums[right];
//            while(count >= target){
//                if(result == 0)result = (right-left+1);
//                else result = Math.min(result, (right-left+1));
//                count-=nums[left];
//                left++;
//            }
//
//        }
//        return result;
//    }
//}
public class 长度最小的子数组01 {
}
