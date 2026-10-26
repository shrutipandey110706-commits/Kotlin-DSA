class Solution {
    fun capitalizeTitle(title: String): String {
        return title.split(" ").joinToString(" ") { word ->
            if (word.length <= 2) {
                word.lowercase()
            } else {
                word.lowercase().replaceFirstChar { it.uppercase() }
            }
        }
    }
}