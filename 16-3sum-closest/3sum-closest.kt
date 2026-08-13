class Solution {
    fun threeSumClosest(nums: IntArray, target: Int): Int {

        nums.sort()

        var closest = nums[0] + nums[1] + nums[2]

        for (i in 0 until nums.size - 2) {

            var left = i + 1
            var right = nums.size - 1

            while (left < right) {

                val sum = nums[i] + nums[left] + nums[right]

                // Exact target mil gaya
                if (sum == target) {
                    return sum
                }

                // Closest sum update karo
                if (kotlin.math.abs(sum - target) <
                    kotlin.math.abs(closest - target)
                ) {
                    closest = sum
                }

                // Two pointer movement
                if (sum < target) {
                    left++
                } else {
                    right--
                }
            }
        }

        return closest
    }
}