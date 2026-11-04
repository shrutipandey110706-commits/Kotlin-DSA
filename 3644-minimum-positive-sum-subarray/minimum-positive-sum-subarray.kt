class Solution {
    fun minimumSumSubarray(nums: List<Int>, l: Int, r: Int): Int {
        var minSum = Int.MAX_VALUE
        val n = nums.size

        for (i in 0 until n) {
            var sum = 0

            for (j in i until n) {
                sum += nums[j]
                val length = j - i + 1

                if (length in l..r && sum > 0) {
                    minSum = minOf(minSum, sum)
                }

                if (length >= r) break
            }
        }

        return if (minSum == Int.MAX_VALUE) -1 else minSum
    }
}