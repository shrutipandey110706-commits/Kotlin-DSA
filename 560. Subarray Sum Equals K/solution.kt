class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {

        // Stores prefix sum and how many times it has occurred
        val map = HashMap<Int, Int>()

        // An empty subarray has sum 0, so store 0 with count 1
        map[0] = 1

        // Stores the current prefix sum
        var sum = 0

        // Stores the total number of valid subarrays
        var count = 0

        for (num in nums) {

            // Add the current number to the prefix sum
            sum += num

            // We need to find a previous prefix sum equal to sum - k
            val requiredSum = sum - k

            // If requiredSum exists, we found one or more subarrays
            // whose sum is equal to k
            if (map.containsKey(requiredSum)) {
                count += map[requiredSum]!!
            }

            // Store the current prefix sum in the HashMap
            // If it already exists, increase its frequency by 1
            map[sum] = (map[sum] ?: 0) + 1
        }

        // Return the total number of subarrays with sum equal to k
        return count
    }
}
