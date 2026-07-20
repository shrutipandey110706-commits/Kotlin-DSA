class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {

        val set = nums1.toHashSet()
        val ans = HashSet<Int>()

        for (num in nums2) {
            if (num in set) {
                ans.add(num)
            }
        }

        return ans.toIntArray()
    }
}