class Solution {
    fun detectCapitalUse(word: String): Boolean {
        
        // Case 1: All letters are uppercase
        if (word == word.uppercase()) {
            return true
        }
        
        // Case 2: All letters are lowercase
        if (word == word.lowercase()) {
            return true
        }
        
        // Case 3: Only the first letter is uppercase
        if (
            word[0].isUpperCase() &&
            word.substring(1).all { it.isLowerCase() }
        ) {
            return true
        }
        
        // Otherwise, invalid capital usage
        return false
    }
}