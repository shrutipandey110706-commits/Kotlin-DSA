class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {

        var windowSum = 0

        // First window
        for (i in 0 until k) {
            windowSum += nums[i]
        }

        var maxSum = windowSum

        // Slide the window
        for (i in k until nums.size) {
            windowSum += nums[i]
            windowSum -= nums[i - k]

            maxSum = maxOf(maxSum, windowSum)
        }

        return maxSum.toDouble() / k
    }
}