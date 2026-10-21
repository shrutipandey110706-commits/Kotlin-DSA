class Solution {
    fun largestEven(s: String): String {
        val lastTwo = s.lastIndexOf('2')

        return if (lastTwo == -1) {
            ""
        } else {
            s.substring(0, lastTwo + 1)
        }
    }
}