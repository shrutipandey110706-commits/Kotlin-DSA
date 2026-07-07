class Solution {
    fun reverseWords(s: String): String {
        return s

        .split(" ") //["Let's", "take", "LeetCode", "contest"] (List<String>)
        .map{it.reversed()} //take a word and reverse it
        .joinToString(" ") //join with ""

        
    }
}