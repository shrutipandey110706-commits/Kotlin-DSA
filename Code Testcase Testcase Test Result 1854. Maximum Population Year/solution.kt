class Solution {
    fun maximumPopulation(logs: Array<IntArray>): Int {
        val population = IntArray(101)

        for (log in logs) {
            population[log[0] - 1950]++ //birthi year
            population[log[1] - 1950]-- //death year
        }

        var maxPopulation = 0 //maxi alive people
        var currentPopulation = 0 //current year alive people
        var earliestYear = 1950 //stores maxi population

        for (i in population.indices) {
            currentPopulation += population[i]

            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation
                earliestYear = 1950 + i
            }
        }

        return earliestYear
    }
}
