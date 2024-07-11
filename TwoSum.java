//By Brute force approach
// class Solution {
//     public int[] twoSum(int[] nums, int target) {

//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] + nums[j] == target) {
//                     int a[] = { i, j };
//                     return a;
//                 }
//             }
//         }
//         return null;

//     }
// }


/*If you want to run this code in LeetCode then just copy paste above code and ignore the
 * code after this comment.
 */


import java.util.Arrays;

public class TwoSum {

    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {  // corrected this line
                if (nums[i] + nums[j] == target) {
                    int[] a = {i, j};
                    return a;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));  // corrected this line
    }
}
