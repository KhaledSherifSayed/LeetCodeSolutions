class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        val n = nums.size
        var k = k
        k %= n
        reverse(0, n - 1, nums)
        reverse(0, k - 1, nums)
        reverse(k, n - 1, nums)
        println(nums.contentToString())
    }

    fun reverse(i: Int, j: Int, nums: IntArray) {
        var iteratorI = i
        var iteratorJ = j
        while (iteratorI < iteratorJ) {
            val temp: Int = nums[iteratorI]
            nums[iteratorI] = nums[iteratorJ]
            nums[iteratorJ] = temp
            ++iteratorI
            --iteratorJ
        }
    }
}