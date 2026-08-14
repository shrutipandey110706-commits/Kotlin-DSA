class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {

        // Left pointer of the sliding window
        var left = 0

        // Current sum of the window
        var currentSum = 0

        // Store minimum length
        // nums.size + 1 means no valid subarray found yet
        var minLength = nums.size + 1

        // Right pointer moves through the array
        for (right in nums.indices) {

            // Add current number to the window
            currentSum += nums[right]

            // If sum becomes >= target,
            // try to make the window smaller
            while (currentSum >= target) {

                // Calculate current window length
                val currentLength = right - left + 1

                // Update minimum length
                minLength = minOf(minLength, currentLength)

                // Remove leftmost element
                currentSum -= nums[left]

                // Move left pointer forward
                left++
            }
        }

        // If minLength was never updated,
        // no valid subarray exists
        return if (minLength == nums.size + 1) {
            0
        } else {
            minLength
        }
    }
}