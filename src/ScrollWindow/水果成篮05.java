package ScrollWindow;
// 题目链接: https://leetcode.cn/problems/fruit-into-baskets/
// 题目类型: 滑动窗口05
// 题目解答:
//class Solution {
//    public int totalFruit(int[] fruits) {
//        int n = fruits.length;
//        int[] hash = new int[n+1];
//        int result = 0;
//        for(int left = 0, right = 0, kinds = 0; right<n; right++){
//            int in = fruits[right]; // 进窗口
//            if(hash[in] == 0) kinds++; // 统计水果种类
//            hash[in]++;
//            while(kinds>2){
//                int out = fruits[left]; // 出窗口
//                hash[out]--;
//                if(hash[out] == 0) kinds--;
//                left++;
//            }
//            result = Math.max(result, right - left + 1); // 更新结果
//        }
//        return result;
//    }
//}
public class 水果成篮05 {
}
