package DoublePoints;

// 题目链接: https://leetcode.cn/problems/valid-triangle-number/
// 题目类型: 双指针+排序05
// 解题代码:
//class Solution {
//    public int triangleNumber(int[] nums) {
//        Arrays.sort(nums);
//        int c = nums.length-1, count = 0;
//        while(c>1){
//            int left = 0, right = c-1;
//            while(left<right){
//                if(nums[left]+nums[right] > nums[c]){
//                    count+=(right-left);
//                    right--;
//                }else{
//                    left++;
//                }
//            }
//            c--;
//        }
//        return count;
//    }
//}
public class 有效三角形个数05 {
}
