class Solution {
    fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
        val people = names.indices.map { i ->
            Pair(names[i],heights[i])
        }
        return people
            .sortedByDescending{it.second}
            .map{it.first}
            .toTypedArray()
    
    }
}
