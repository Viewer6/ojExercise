package ScrollWindow;
// 题目链接: https://leetcode.cn/problems/minimum-operations-to-reduce-x-to-zero/
// 题目类型: 滑动窗口04+取反
// 题目解答:
//class Solution {
//    public int minOperations(int[] nums, int x) {
//        int count = 0, n = nums.length;
//        for(int i = 0; i<n; i++){
//            count+=nums[i];
//        }
//        int target = count - x, left = 0, right = 0, result = -1;
//        if(target<0){
//            return -1;
//        }
//        count = 0;
//        while(right<n){
//            count+=nums[right];
//            while(count>target && left<n){
//                count-=nums[left];
//                left++;
//            }
//            if(count==target){
//                result = Math.max(result, right-left+1);
//            }
//            right++;
//        }
//        if(result==-1){
//            return result;
//        }
//        return n-result;
//    }
//}
public class 将x减到0的最小操作数04 {
//    public static void main(String[] args) {
//        System.out.println(Solution.minOperations(new int[]{3,2,20,1,1,3}, 5));
//    }
}
