
class Solution {
    fun secondHighest(s: String): Int {
        val digits = s.filter { it.isDigit() }
            .map { it - '0' }
            .distinct()
            .sortedDescending()

        return if (digits.size >= 2) digits[1] else -1
    }
}
