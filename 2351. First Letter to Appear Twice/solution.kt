class Solution {
    fun repeatedCharacter(s: String): Char {
        val seen = BooleanArray(26)
        
        for (char in s) {
            val index = char - 'a' //Map the character to a 0-25 index range (0,25)
            if (seen[index]) {
                return char
            }
            seen[index] = true //mark true as visited
        }
        
        return ' '
    }
}
