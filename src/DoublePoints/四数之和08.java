package DoublePoints;

// 题目链接: https://leetcode.cn/problems/4sum/
// 题目类型: 双指针08
// 解题代码:
//class Solution {
//    public List<List<Integer>> fourSum(int[] nums, int target) {
//        List<List<Integer>> result = new ArrayList<>();
//        int a = 0, len = nums.length;
//        Arrays.sort(nums);
//        while(a<len){
//
//            int b = a+1;
//            while(b < len){
//                int left = b+1, right = len - 1;
//                long t = (long)target - nums[a] - nums[b];  // 处理溢出情况
//                while(left<right){
//                    int count = nums[left] + nums[right];
//                    if(count>t)right--;
//                    else if(count<t)left++;
//                    else{
//                        result.add(new ArrayList<>(Arrays.asList(nums[a], nums[b], nums[left], nums[right])));
//                        left++; right--;
//                        while(left<right && nums[left] == nums[left-1])left++;
//                        while(left<right && nums[right] == nums[right+1])right--;
//                    }
//                }
//                b++;
//                while(b<len && nums[b] == nums[b-1])b++;
//            }
//            a++;
//            while(a<len && nums[a] == nums[a-1])a++;
//        }
//        return result;
//    }
//}
public class 四数之和08 {
}
