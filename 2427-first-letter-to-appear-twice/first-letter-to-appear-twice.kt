class Solution {
    fun repeatedCharacter(s: String): Char {
        val seen = BooleanArray(26)
        
        for (char in s) {
            val index = char - 'a'
            if (seen[index]) {
                return char
            }
            seen[index] = true
        }
        
        return ' '
    }
}
