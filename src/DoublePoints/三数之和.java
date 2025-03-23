package DoublePoints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 题目链接: https://leetcode.cn/problems/3sum/
// 题目类型: 双指针07
// 解题代码:
//class Solution {
//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        int c = 0, len = nums.length;
//        Arrays.sort(nums);
//        while(c<len && nums[c] <= 0){
//            int left = c+1, right = len-1;
//            while(left<right){
//                int count = nums[left] + nums[right];
//                if(count > -nums[c])right--;
//                else if(count<-nums[c])left++;
//                else{
//                    result.add(new ArrayList<Integer>(Arrays.asList(nums[c], nums[left], nums[right])));
//                    left++; right--;
//                    while(left<right && nums[right+1] == nums[right])right--;
//                    while(left<right && nums[left-1] == nums[left])left++;
//                }
//            }
//            c++;
//            while(c<len && nums[c] == nums[c-1])c++;
//        }
//        return result;
//    }
//}
//class Solution {
//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        int c = 0;
//        Arrays.sort(nums);
//        while(c<nums.length && nums[c] < 0){
//            int left = c+1, right = nums.length-1;
//            while(left<right){
//                int count = nums[left] + nums[right];
//                if(count > -nums[c])right--;
//                else if(count<-nums[c])left++;
//                else{
//                    List<Integer> list= new ArrayList<>();
//                    list.add(nums[c]);
//                    list.add(nums[left]);
//                    list.add(nums[right]);
//                    result.add(list);
//                    left++; right--;
//                    while(left<right && nums[right-1] == nums[right])right--;
//                    while(left<right && nums[left+1] == nums[left])left++;
//                }
//            }
//            c++;
//            while(c<nums.length && nums[c] == nums[c-1])c++;
//        }
//        return result;
//    }
//}
public class 三数之和 {
    public static void main(String[] args) {
//        System.out.println(Solution.threeSum(new int[]{-2,0,1,1,2}));
    }
}
