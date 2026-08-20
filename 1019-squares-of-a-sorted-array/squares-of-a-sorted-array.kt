class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        val result = IntArray(nums.size)

        var left = 0
        var right = nums.lastIndex
        var index = nums.lastIndex

        while (left <= right) {
            val leftSquare = nums[left] * nums[left]
            val rightSquare = nums[right] * nums[right]

            if (leftSquare > rightSquare) {
                result[index] = leftSquare
                left++
            } else {
                result[index] = rightSquare
                right--
            }

            index--
        }

        return result
    }
}