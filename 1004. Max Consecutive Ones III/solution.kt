class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {

        var left = 0
        var zeros =0
        var maxLength =0

        for (right in nums.indices){
             // Count zero in current window
            if(nums[right]==0){
                zeros ++
            }
            // More than k zeros -> shrink window
            while (zeros>k){
                if(nums[left]==0){
                    zeros --
                }
                left++
            }
             // Update maximum window length
            maxLength =maxOf (maxLength,right-left+1)


        }
        return maxLength
        
    }
}
