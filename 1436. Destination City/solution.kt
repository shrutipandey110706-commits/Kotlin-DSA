class Solution {
    fun destCity(paths: List<List<String>>): String {
        val starting_cities = mutableSetOf<String>()

        for (path in paths){
            starting_cities.add(path[0])
        }
        for (path in paths){
            if (path[1] !in starting_cities){
                return path[1]
            }
        }
        return " "
    }
}
