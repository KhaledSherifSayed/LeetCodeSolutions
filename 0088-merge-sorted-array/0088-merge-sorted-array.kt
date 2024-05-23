class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
         if (n != 0) {
            var count = 0
            for (i in m until (m + n)) {
                nums1[i] = nums2[count]
                count = count.plus(1)
            }
        }
        nums1.sort()
    }
}