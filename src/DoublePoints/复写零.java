package DoublePoints;

// 题目链接: https://leetcode.cn/problems/duplicate-zeros/submissions/614153672/
// 题目类型: 双指针02
// 题目解答

//class Solution {
//    public void duplicateZeros(int[] arr) {
//        int cur = 0, dest = -1, n = arr.length;
//        // 1. 找到最后一个数
//        while(cur<n){
//            if(arr[cur] == 0) dest+=2;
//            else dest++;
//            if(dest>=n-1)break;
//            cur++;
//        }
//        // 2. 处理越界问题
//        if(dest > n-1){
//            arr[n-1] = 0;
//            cur--;
//            dest -= 2;
//        }
//        // 3. 进行移位
//        while(cur>=0){
//            if(arr[cur] != 0)arr[dest--]=arr[cur--];
//            else {
//                arr[dest--] = 0;
//                arr[dest--] = 0;
//                cur--;
//            }
//        }
//    }
//}
public class 复写零 {
}
