
class Solution:
    def twoOutOfThree(self, nums1, nums2, nums3):
        set1 = set(nums1)
        set2 = set(nums2)
        set3 = set(nums3)

        result = set()

        for num in set1 | set2 | set3:
            count = 0

            if num in set1:
                count += 1
            if num in set2:
                count += 1
            if num in set3:
                count += 1

            if count >= 2:
                result.add(num)

        return list(result)
