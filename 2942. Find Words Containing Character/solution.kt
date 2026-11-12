
class Solution {
    fun findWordsContaining(words: Array<String>, x: Char): List<Int> {
        val result = mutableListOf<Int>()

        for (i in words.indices) {
            if (x in words[i]) {
                result.add(i)
            }
        }

        return result
    }
}
