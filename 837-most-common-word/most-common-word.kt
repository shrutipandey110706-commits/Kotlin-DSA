class Solution {
    fun mostCommonWord(paragraph: String, banned: Array<String>): String {
        val bannedSet = banned.toSet()

        val words = paragraph.lowercase()
            .split(Regex("[!?',;. ]+"))
            .filter { it.isNotEmpty() && it !in bannedSet }

        return words.groupingBy { it }
            .eachCount()
            .maxByOrNull { it.value }!!
            .key
    }
}