package DoublePoints;

// 题目链接: https://leetcode.cn/problems/container-with-most-water/submissions/614407116/
// 题目类型: 双指针04
// 解题代码:
//class Solution {
//    public int maxArea(int[] height) {
//        int left = 0, right = height.length-1, max = -1;
//        while(left<right){
//            int v;
//            if(height[left]<height[right]){
//                v = height[left]*(right-left);
//                left++;
//            }else {
//                v = height[right]*(right-left);
//                right--;
//            }
//            if(v>max){
//                max = v;
//            }
//        }
//        return max;
//    }
//}
public class 盛最多水容器04 {
}
