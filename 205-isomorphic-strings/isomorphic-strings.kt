class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {

        // If lengths are different, they cannot be isomorphic
        if (s.length != t.length) return false

        // Maps characters from s -> t
        val mapST = HashMap<Char, Char>()

        // Maps characters from t -> s
        val mapTS = HashMap<Char, Char>()

        // Check each character
        for (i in s.indices) {

            val charS = s[i]
            val charT = t[i]

            // Check if charS is mapped to a different character
            if (mapST.containsKey(charS) && mapST[charS] != charT) {
                return false
            }

            // Check if charT is already mapped from another character
            if (mapTS.containsKey(charT) && mapTS[charT] != charS) {
                return false
            }

            // Store s -> t mapping
            mapST[charS] = charT

            // Store t -> s mapping
            mapTS[charT] = charS
        }

        // All mappings are valid
        return true
    }
}