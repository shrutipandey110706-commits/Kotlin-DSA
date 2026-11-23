class Solution {
    fun triangleType(nums: IntArray): String {
        val a =nums[0]
        val b =nums[1]
        val c= nums[2]

        if (a+b<=c || a + c <= b || b + c <= a){
            return "none"
        }
        return when {
            a == b && b == c -> "equilateral"
            a == b || b == c || a == c -> "isosceles"
            else -> "scalene"
        }
    }
}