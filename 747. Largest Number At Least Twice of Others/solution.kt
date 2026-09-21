class Solution {
    fun dominantIndex(nums: IntArray): Int {
        var maxIndex = 0

        // Find the largest element
        for (i in nums.indices) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i
            }
        }

        // Check if largest is at least twice every other element
        for (i in nums.indices) {
            if (i != maxIndex && nums[maxIndex] < 2 * nums[i]) {
                return -1
            }
        }

        return maxIndex
    }
}
