class Solution {
    fun rob(nums: IntArray): Int {

        var prev1=0
        var prev2=0

        for (money in nums){
            val rob=prev2+money
            val skip=prev1

            val current = maxOf (rob, skip)

            prev2=prev1
            prev1=current
        }
        return prev1
        
    }
}