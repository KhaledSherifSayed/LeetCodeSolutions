class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var count = 0
        for (i in nums.indices) {
            if (i < (nums.size - 2) && nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                continue
            } else {
                nums[count++] = nums[i]
            }
        }
        return count
    }
}