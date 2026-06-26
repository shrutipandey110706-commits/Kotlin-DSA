// class Solution {
//     fun twoSum(nums: IntArray, target: Int): IntArray {
//         val map = HashMap<Int, Int>() // value -> index ,,,HashMap<Key, Value>()

//         for (i in nums.indices) {
//             val complement = target - nums[i]

//             if (map.containsKey(complement)) {
//                 return intArrayOf(map[complement]!!, i)
//             }

//             map[nums[i]] = i
//         }

//         return intArrayOf() // never reached (as per problem guarantee)
//     }
// }

//

class Solution {
    fun twoSum (nums:IntArray, target:Int):IntArray {
        for (i in nums.indices) {
            for (j in i+1 until nums.size) {
                if (nums[i]+nums[j]==target){
                    return intArrayOf(i,j)
            }
        }
    }
        return intArrayOf ()
}
}