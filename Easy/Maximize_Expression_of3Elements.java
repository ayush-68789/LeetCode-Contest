public class Maximize_Expression_of3Elements {
    public static void main(String[] args) {
// You are given an integer array nums.
// Choose three elements a, b, and c from nums at distinct indices such that the value of the expression a + b - c is maximized.
// Return an integer denoting the maximum possible value of this expression.
        int [] nums = {1,4,2,5} ;
        System.out.println(maximizeExpressionOfThree(nums));
// Example 1:
// Input: nums = [1,4,2,5]
// Output: 8
// Explanation:
// We can choose a = 4, b = 5, and c = 1. The expression value is 4 + 5 - 1 = 8, which is the maximum possible.

// Example 2:
// Input: nums = [-2,0,5,-2,4]
// Output: 11

// Explanation:
// We can choose a = 5, b = 4, and c = -2. The expression value is 5 + 4 - (-2) = 11, which is the maximum possible
// Constraints:
// 3 <= nums.length <= 100
// -100 <= nums[i] <= 100©leetcode
    }

    public static int maximizeExpressionOfThree(int[] nums) {
        int n = nums.length ; 
        int mini = Integer.MAX_VALUE ; 
        int second = Integer.MIN_VALUE ; 
        int first = Integer.MIN_VALUE ; 
        
        for(int i = 0; i < n ; i++)
            {
                mini = Math.min(mini , nums[i]) ;

                if(first < nums[i])
                {
                    second = first ; 
                    first = nums[i] ; 
                }
                else if(second < nums[i])
                {
                    second = nums[i] ;
                }
            }

        return (first + second - mini) ;
    }

//     class Solution {
//     public int maximizeExpressionOfThree(int[] nums) {
//         Arrays.sort(nums) ; 
//         int n = nums.length ; 
//         return (nums[n-1] + nums[n-2] - nums[0]) ;
//     }
// }
}
