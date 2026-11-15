
class Solution {
    fun convertToTitle(columnNumber: Int): String {
        var num = columnNumber
        val result = StringBuilder()

        while (num > 0) {
            num-- 
            val remainder = num % 26

            result.append(('A'.code + remainder).toChar())

            num /= 26
        }

        return result.reverse().toString()
    }
}
