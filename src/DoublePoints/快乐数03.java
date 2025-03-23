package DoublePoints;
// 题目链接: https://leetcode.cn/problems/happy-number/
// 题目类型: 双指针03
// 解题方法: 快慢指针
//class Solution {
//    public int sum(int n){
//        int sum = 0;
//        while(n!=0){
//            int t = n%10;
//            sum += t * t;
//            n/=10;
//        }
//        return sum;
//    }
//    public boolean isHappy(int n) {
//        int slow = n, fast = sum(n);
//        while(slow!=fast){
//            slow = sum(slow);
//            fast = sum(sum(fast));
//        }
//        return slow == 1;
//    }
//}
public class 快乐数03 {
}
