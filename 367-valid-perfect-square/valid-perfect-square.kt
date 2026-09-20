class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        var low = 1
        var high = num

        while (low <= high) {
            val mid = low + (high - low) / 2
            val square = mid.toLong() * mid

            when {
                square == num.toLong() -> return true
                square < num -> low = mid + 1
                else -> high = mid - 1
            }
        }

        return false
    }
}