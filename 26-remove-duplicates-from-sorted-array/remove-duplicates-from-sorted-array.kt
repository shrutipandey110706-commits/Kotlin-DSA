class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        
        if (nums.isEmpty()) return 0
        var i = 1 // starting always uniques

        for (j in 1 until nums.size){
            if (nums[j]!=nums[j-1]) {
                nums[i]=nums[j]
                i++
            }

        }
        return i


    }
}