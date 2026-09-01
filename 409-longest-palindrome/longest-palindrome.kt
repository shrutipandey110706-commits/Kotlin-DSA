class Solution {
    fun longestPalindrome(s: String): Int {

        // Count frequency of each character
        val freq = IntArray(128)

        for (ch in s) {
            freq[ch.code]++
        }

        var length = 0
        var hasOdd = false

        // Take pairs of characters
        for (count in freq) {
            length += (count / 2) * 2

            // Odd count can provide the middle character
            if (count % 2 == 1) {
                hasOdd = true
            }
        }

        // Add one character in the middle
        if (hasOdd) {
            length++
        }

        return length
    }
}