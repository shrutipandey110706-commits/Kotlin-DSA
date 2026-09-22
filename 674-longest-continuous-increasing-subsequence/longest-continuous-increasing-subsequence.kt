class Solution {
    fun findLengthOfLCIS(nums: IntArray): Int {
        
        if (nums.isEmpty()) return 0 //if empty

        var current =1 
        var longest =1

        for (i in 1 until nums.size){
            if (nums[i]>nums[i-1]){
                current ++
            }
            else {
                current =1
            }

            longest = maxOf(longest,current)
        }
        return longest
    }
}