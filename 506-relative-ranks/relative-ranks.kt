
class Solution {
    fun findRelativeRanks(score: IntArray): Array<String> {

        val sortedScore = score.sortedDescending()

        val rankMap = HashMap<Int, String>()

        for (i in sortedScore.indices) {

            val rank = when (i) {
                0 -> "Gold Medal"
                1 -> "Silver Medal"
                2 -> "Bronze Medal"
                else -> (i + 1).toString()
            }

            rankMap[sortedScore[i]] = rank
        }

        val answer = Array(score.size) { i ->
            rankMap[score[i]]!!
        }

        return answer
    }
}

